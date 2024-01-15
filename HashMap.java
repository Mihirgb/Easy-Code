 HashMap<Integer,Integer>hm=new HashMap();
        for(int a[]:matches){
            hm.put(a[0],0);
            hm.put(a[1],hm.getOrDefault(a[1],0)+1);
        }
        for(Map.Entry<Integer,Integer>entry:hm.entrySet()){
        System.out.println(entry.getKey()+" "+entry.getValue());
        }
