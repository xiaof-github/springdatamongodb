package com.example.demomongodb.service;

import com.example.demomongodb.document.IPStats;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationOperation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.aggregation.GroupOperation;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Component
public class IPStatsOperation {
    @Autowired
    private MongoTemplate mongoTemplate;

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void addCollection() {
        List<IPStats> ipStatsList = new ArrayList<>();

        ipStatsList.add(new IPStats("21", "10.1.1.24", "10.1.1.25", "dzdsf",
                123113L, "", "tcp",
                1574954642345L, 1574955642345L,
                23452L, 234L, 12L, 1L));
        ipStatsList.add(new IPStats("22", "10.1.1.24", "10.1.1.25", "dzdsf",
                123114L, "", "tcp",
                1574954642345L, 1574955642345L,
                23452L, 234L, 12L, 1L));
        ipStatsList.add(new IPStats("23", "10.1.1.24", "10.1.1.25", "dzdsf",
                123115L, "", "tcp",
                1574954642345L, 1574955642345L,
                23452L, 234L, 12L, 1L));
        ipStatsList.add(new IPStats("24", "10.1.1.24", "10.1.1.25", "dzdsf",
                123116L, "", "tcp",
                1574954642345L, 1574955642345L,
                23452L, 234L, 12L, 1L));
        ipStatsList.add(new IPStats("25", "10.1.1.24", "10.1.1.25", "dzdsf",
                123116L, "", "tcp",
                1574954642345L, 1574955645345L,
                123452L, 1234L, 82L, 2L));

        ipStatsList.add(new IPStats("6", "10.1.1.29", "10.1.1.25", "dzdsf",
                123113L, "", "tcp",
                1574954642345L, 1574955642345L,
                23452L, 234L, 12L, 1L));
        ipStatsList.add(new IPStats("7", "10.1.1.28", "10.1.1.25", "dzdsf",
                123114L, "", "tcp",
                1574954642345L, 1574955642345L,
                23452L, 234L, 12L, 1L));
        ipStatsList.add(new IPStats("8", "10.1.1.23", "10.1.1.27", "dzdsf",
                123115L, "", "tcp",
                1574954642345L, 1574955642345L,
                23452L, 234L, 12L, 1L));
        ipStatsList.add(new IPStats("9", "10.1.1.22", "10.1.1.29", "dzdsf",
                123116L, "", "tcp",
                1574954642345L, 1574955642345L,
                23452L, 234L, 12L, 1L));
        ipStatsList.add(new IPStats("10", "10.1.1.25", "10.1.1.26", "dzdsf",
                123116L, "", "tcp",
                1574954642345L, 1574985645345L,
                51223452L, 1234232L, 282L, 232L));

        mongoTemplate.insert(ipStatsList, "ipStats");// 第一个参数是要插入的数据（文档），第二个参数是集合名称；批量插入
    }

    public List<IPStats> query(){
        Query query = Query.query(Criteria.where("srcIP").is("10.1.1.25"));
        List<IPStats> ipStatsList = mongoTemplate.find(query, IPStats.class);
        logger.debug("get {}", ipStatsList);
        return ipStatsList;
    }

    public List<HashMap> aggregation(){
        String[] keys = new String[]{"dstIP"};
        String[] values = new String[]{"10.1.1.26"};
        String[] queryKey = new String[]{"sendBytes"};
        // 聚合操作
        List<AggregationOperation> operations = new ArrayList<>();

        // 筛选条件
        for (int i = 0; i < keys.length; i++) {
            operations.add(Aggregation.match(Criteria.where(keys[i]).is(values[i])));
        }

        //分组字段
        GroupOperation groupOperation = Aggregation.group("dstIP");

        // 聚合查询字段
        for (int i = 0; i < queryKey.length; i++) {
            groupOperation = groupOperation.sum(queryKey[i]).as(queryKey[i]);
        }
        // 添加选项  (聚合查询字段和添加筛选是有区别的注意)
        operations.add(groupOperation);

        // 最终聚合查询所有信息
        Aggregation aggregation = Aggregation.newAggregation(operations);
        // 查询结果
        AggregationResults<HashMap> results = mongoTemplate.aggregate(aggregation, "ipStats", HashMap.class);
        //获取结果
        List<HashMap> result = results.getMappedResults();
        logger.debug("result: {}", result);
        return result;
    }

}
