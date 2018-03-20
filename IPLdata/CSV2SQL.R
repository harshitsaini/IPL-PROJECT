Match_data = read.csv(file="C:\\Users\\Harshit\\Desktop\\IPL_PROJ\\IPLdata\\CSV DATASET\\Match.csv",
                      header=TRUE, sep=",")

Match_df= as.data.frame(Match_data)

Query_prefix="Insert into Match_records value"
Query_record=NULL

row_no= as.numeric(dim(Match_df)[1])
col_no= as.numeric(dim(Match_df)[2])

adder= c(2,6,8,12,18,19)

for (row in 1:row_no) {
  cur_query=paste0(Query_prefix,"(",as.character(Match_df[row,1]),"")

  for (col in 2:col_no) {
    add_it= ""
    if(col %in%  adder){
      add_it= "'"
    }
    cur_query=paste0(cur_query,",",add_it,as.character(Match_df[row,col]),add_it)
  }
  cur_query=paste0(cur_query,");")
  Query_record=cbind(Query_record,cur_query)
}

fileConn= file("C:\\Users\\Harshit\\Desktop\\IPL_PROJ\\IPLdata\\CSV DATASET\\Match-Mysql Query Output.sql")
writeLines(Query_record,fileConn)
close(fileConn)

##################################################TEAM.csv####################################################

Team_data = read.csv(file="C:\\Users\\Harshit\\Desktop\\IPL_PROJ\\IPLdata\\CSV DATASET\\Team.csv",
                      header=TRUE, sep=",")

Team_df= as.data.frame(Team_data)

Query_prefix="Insert into Team_records value"
Query_record=NULL

row_no= as.numeric(dim(Team_df)[1])
col_no= as.numeric(dim(Team_df)[2])

adder= c(2,3)

for (row in 1:row_no) {
  cur_query=paste0(Query_prefix,"(",as.character(Team_df[row,1]),"")
  
  for (col in 2:col_no) {
    add_it= ""
    if(col %in%  adder){
      add_it= "'"
    }
    cur_query=paste0(cur_query,",",add_it,as.character(Team_df[row,col]),add_it)
  }
  cur_query=paste0(cur_query,");")
  Query_record=cbind(Query_record,cur_query)
}

fileConn= file("C:\\Users\\Harshit\\Desktop\\IPL_PROJ\\IPLdata\\CSV DATASET\\Team-Mysql Query Output.sql")
writeLines(Query_record,fileConn)
close(fileConn)

###################################################PLayer.csv#############################################
Player_data = read.csv(file="C:\\Users\\Harshit\\Desktop\\IPL_PROJ\\IPLdata\\CSV DATASET\\Player.csv",
                     header=TRUE, sep=",")

Player_df= as.data.frame(Player_data)

Query_prefix="Insert into Team_records value"
Query_record=NULL

row_no= as.numeric(dim(Player_df)[1])
col_no= as.numeric(dim(Player_df)[2])

adder= c(2,3,4,5,6)

for (row in 1:row_no) {
  cur_query=paste0(Query_prefix,"(",as.character(Player_df[row,1]),"")
  
  for (col in 2:col_no) {
    add_it= ""
    if(col %in%  adder){
      add_it= "'"
    }
    cur_query=paste0(cur_query,",",add_it,as.character(Player_df[row,col]),add_it)
  }
  cur_query=paste0(cur_query,");")
  Query_record=cbind(Query_record,cur_query)
}

fileConn= file("C:\\Users\\Harshit\\Desktop\\IPL_PROJ\\IPLdata\\CSV DATASET\\Player-Mysql Query Output.sql")
writeLines(Query_record,fileConn)
close(fileConn)