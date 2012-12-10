package com.fearsfx.elsys.hw16;

import java.util.*;

public class ManyToOneRelation {

	static Map rel = new HashMap();
	
	public void connect(String src, String trg) {
		rel.put(src, trg);
	}
	
	public boolean containsSource(String src) {
		if(rel.containsKey(src)){
			return true;
		}else{
			return false;
		}
	}
	
	public boolean containsTarget(String trg) {
		if(rel.containsValue(trg)){
			return true;
		}else{
			return false;
		}
	}
	
	public String getTarget(String src) {
	return (String) rel.get(src);
	}
	
	public List<String> getSources(String trg) {
		List<String> res = new ArrayList<String>();
		for ( Iterator it = rel.entrySet().iterator(); it.hasNext(); ) {
		    Map.Entry e = (Map.Entry) it.next();
		    if(e.getValue().equals(trg)){
		    	res.add((String)e.getKey());
		    }
		}
		return res;
	}
	
	public void disconnectSource(String src) {
		for ( Iterator it = rel.entrySet().iterator(); it.hasNext(); ) {
		    Map.Entry e = (Map.Entry) it.next();
		    if(e.getKey().equals(src)){
		    	rel.remove(e.getKey());
		    }
		}
	}
	
	public void disconnect(String trg) {
		if(rel.containsValue(trg)){
			for ( Iterator it = rel.entrySet().iterator(); it.hasNext(); ) {
			    Map.Entry e = (Map.Entry) it.next();
			    rel.remove(e.getKey());
			}
		}
	}
	
	public List<String> getTargets() {
		List<String> res = new ArrayList<String>();
		for ( Iterator it = rel.entrySet().iterator(); it.hasNext(); ) {
		    Map.Entry e = (Map.Entry) it.next();
		    if (!res.contains(e.getValue())){
			    res.add((String)e.getValue());	
		    }
		}
		return res;
	}
	
	public void print(){
		System.out.println(rel.size());
		if(rel.size() != 0){
			for ( Iterator it = rel.entrySet().iterator(); it.hasNext(); ) {
			    Map.Entry e = (Map.Entry) it.next();
			    System.out.println( e.getKey() + " => " + e.getValue() );
			}
		}
	}

	public static void main(String[] args) {

		ManyToOneRelation sth = new ManyToOneRelation();

		sth.connect("src1", "trg1");
		sth.connect("src2", "trg1");
		sth.connect("src3", "trg2");
		sth.connect("src4", "trg2");

		sth.print();
		
		System.out.println(sth.getSources("trg1"));
		System.out.println(sth.getTargets());
		System.out.println(sth.containsSource("asd"));
		System.out.println(sth.containsSource("src2"));
		System.out.println(sth.containsTarget("trg2"));
		System.out.println(sth.getTarget("src3"));
		
//		sth.disconnectSource("src2");
		System.out.println(sth.getSources("trg2"));

		sth.disconnect("trg1");

		
	}
}

