Match_data = read.csv(file="C:\\Users\\Harshit\\Desktop\\IPL_PROJ\\IPLdata\\CSV DATASET\\Match.csv",
                      header=TRUE, sep=",")

Match_df= as.data.frame(Match_data)

Query_prefix="Insert into Match_records value"
Query_record=NULL

row_no= as.numeric(dim(Match_df)[0])
col_no= as.numeric(dim(Match_df)[1])
for (row in 1:row_no) {
  cur_query=paste(Query_prefix,"(")
  #data.append(row)
  for (col in 1:col_no) {
    cur_query=paste(cur_query,as.character(Match_df[row,col]),sep=",")
  }
}


