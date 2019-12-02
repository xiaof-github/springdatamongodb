package com.example.demomongodb.service;

import com.example.demomongodb.document.IPStats;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WriteIPStats {
    @Autowired
    private MongoTemplate mongoTemplate;

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


}
