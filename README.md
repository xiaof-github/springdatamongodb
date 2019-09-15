# springdatamongodb
spingdata实现mongodb的示例

# demo说明
实现了基于spring-data框架，使用MongoTemplate查询mongodb数据

# mongodb数据
数据的database为mydb，collection为test_stock

集合中的数据如下：

/* 1 createdAt:2019/2/12 下午10:43:07*/
{
	"_id" : ObjectId("5c62db7b10b3205e41970b34"),
	"ts_code" : "600318.SH",
	"trade_date" : "20190102",
	"open" : 7.17,
	"high" : 7.37,
	"low" : 7.14,
	"close" : 7.25,
	"pre_close" : 7.12,
	"change" : 0.13,
	"pct_chg" : 1.8258,
	"vol" : 62659,
	"amount" : 45392.424
},

/* 2 createdAt:2019/2/12 下午10:43:07*/
{
	"_id" : ObjectId("5c62db7b10b3205e41970b33"),
	"ts_code" : "600318.SH",
	"trade_date" : "20190103",
	"open" : 7.26,
	"high" : 7.32,
	"low" : 7.03,
	"close" : 7.05,
	"pre_close" : 7.25,
	"change" : -0.2,
	"pct_chg" : -2.7586,
	"vol" : 56887,
	"amount" : 40614.719
},

/* 3 createdAt:2019/2/12 下午10:43:07*/
{
	"_id" : ObjectId("5c62db7b10b3205e41970b32"),
	"ts_code" : "600318.SH",
	"trade_date" : "20190104",
	"open" : 6.88,
	"high" : 7.76,
	"low" : 6.88,
	"close" : 7.46,
	"pre_close" : 7.05,
	"change" : 0.41,
	"pct_chg" : 5.8156,
	"vol" : 119170.73,
	"amount" : 87520.723
},

/* 4 createdAt:2019/2/12 下午10:43:07*/
{
	"_id" : ObjectId("5c62db7b10b3205e41970b31"),
	"ts_code" : "600318.SH",
	"trade_date" : "20190107",
	"open" : 7.52,
	"high" : 7.54,
	"low" : 7.3,
	"close" : 7.4,
	"pre_close" : 7.46,
	"change" : -0.06,
	"pct_chg" : -0.8043,
	"vol" : 89443.75,
	"amount" : 66152.067
},

/* 5 createdAt:2019/2/12 下午10:43:07*/
{
	"_id" : ObjectId("5c62db7b10b3205e41970b30"),
	"ts_code" : "600318.SH",
	"trade_date" : "20190108",
	"open" : 7.35,
	"high" : 7.38,
	"low" : 7.21,
	"close" : 7.3,
	"pre_close" : 7.4,
	"change" : -0.1,
	"pct_chg" : -1.3514,
	"vol" : 60829.48,
	"amount" : 44413.506
},

/* 6 createdAt:2019/2/12 下午10:43:07*/
{
	"_id" : ObjectId("5c62db7b10b3205e41970b2f"),
	"ts_code" : "600318.SH",
	"trade_date" : "20190109",
	"open" : 7.29,
	"high" : 7.43,
	"low" : 7.23,
	"close" : 7.28,
	"pre_close" : 7.3,
	"change" : -0.02,
	"pct_chg" : -0.274,
	"vol" : 72663.48,
	"amount" : 53391.101
},

/* 7 createdAt:2019/2/12 下午10:43:07*/
{
	"_id" : ObjectId("5c62db7b10b3205e41970b2e"),
	"ts_code" : "600318.SH",
	"trade_date" : "20190110",
	"open" : 7.26,
	"high" : 7.33,
	"low" : 7.13,
	"close" : 7.15,
	"pre_close" : 7.28,
	"change" : -0.13,
	"pct_chg" : -1.7857,
	"vol" : 54784.47,
	"amount" : 39628.013
},

/* 8 createdAt:2019/2/12 下午10:43:07*/
{
	"_id" : ObjectId("5c62db7b10b3205e41970b2d"),
	"ts_code" : "600318.SH",
	"trade_date" : "20190111",
	"open" : 7.19,
	"high" : 7.28,
	"low" : 7.09,
	"close" : 7.15,
	"pre_close" : 7.15,
	"change" : 0,
	"pct_chg" : 0,
	"vol" : 42932.33,
	"amount" : 30737.979
},

/* 9 createdAt:2019/2/12 下午10:43:07*/
{
	"_id" : ObjectId("5c62db7b10b3205e41970b2c"),
	"ts_code" : "600318.SH",
	"trade_date" : "20190114",
	"open" : 7.17,
	"high" : 7.2,
	"low" : 7.04,
	"close" : 7.08,
	"pre_close" : 7.15,
	"change" : -0.07,
	"pct_chg" : -0.979,
	"vol" : 32475.11,
	"amount" : 23045.032
},

/* 10 createdAt:2019/2/12 下午10:43:07*/
{
	"_id" : ObjectId("5c62db7b10b3205e41970b2b"),
	"ts_code" : "600318.SH",
	"trade_date" : "20190115",
	"open" : 7.11,
	"high" : 7.2,
	"low" : 7.04,
	"close" : 7.2,
	"pre_close" : 7.08,
	"change" : 0.12,
	"pct_chg" : 1.6949,
	"vol" : 35275.16,
	"amount" : 25171.231
},

/* 11 createdAt:2019/2/12 下午10:43:07*/
{
	"_id" : ObjectId("5c62db7b10b3205e41970b2a"),
	"ts_code" : "600318.SH",
	"trade_date" : "20190116",
	"open" : 7.31,
	"high" : 7.31,
	"low" : 7.1,
	"close" : 7.12,
	"pre_close" : 7.2,
	"change" : -0.08,
	"pct_chg" : -1.1111,
	"vol" : 35097.16,
	"amount" : 25191.187
},

/* 12 createdAt:2019/2/12 下午10:43:07*/
{
	"_id" : ObjectId("5c62db7b10b3205e41970b29"),
	"ts_code" : "600318.SH",
	"trade_date" : "20190117",
	"open" : 7.08,
	"high" : 7.12,
	"low" : 6.9,
	"close" : 6.9,
	"pre_close" : 7.12,
	"change" : -0.22,
	"pct_chg" : -3.0899,
	"vol" : 50261.38,
	"amount" : 35257.086
},

/* 13 createdAt:2019/2/12 下午10:43:07*/
{
	"_id" : ObjectId("5c62db7b10b3205e41970b28"),
	"ts_code" : "600318.SH",
	"trade_date" : "20190118",
	"open" : 7,
	"high" : 7,
	"low" : 6.6,
	"close" : 6.74,
	"pre_close" : 6.9,
	"change" : -0.16,
	"pct_chg" : -2.3188,
	"vol" : 70639.02,
	"amount" : 47841.391
}
