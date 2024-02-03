 HashMap<Integer,Integer>hm=new HashMap();
       for(int a:nums){
            hm.put(a,hm.getOrDefault(a,0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
        System.out.println(entry.getKey()+" "+entry.getValue());
        }
