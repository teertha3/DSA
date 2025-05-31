public static List<Integer> matchingStrings(List<String> stringList, List<String> queries) {
        
        List<Integer>res=new ArrayList<>();
        for(int i=0;i<queries.size();i++){
            int c=0;
            for(int j=0;j<stringList.size();j++){
                if(stringList.get(j).equals(queries.get(i))){
                    c+=1;
                }
            }
            res.add(c);
        }
        return res;   

    }
