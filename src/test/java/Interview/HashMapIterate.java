package Interview;

import java.util.*;

public class HashMapIterate {
    private HashMap<String, PinCodeUserInfo> hmap;
    private Hashtable<String,PinCodeUserInfo> htab;
    private LinkedHashMap<String,PinCodeUserInfo> linkhmap;

    public HashMapIterate() {
        hmap = new HashMap<String, PinCodeUserInfo>();
        htab= new Hashtable<>();
        linkhmap= new LinkedHashMap<>();
    }

    //linkedhashmap

    public void pincoderegisterLinkedhashmap(PinCodeUserInfo pinCodeUserInfo)
    {
        linkhmap.put(pinCodeUserInfo.getPinCode(),pinCodeUserInfo);
    }

    public PinCodeUserInfo retreiveDetailsLinkedhashmap(String pincode)
    {
        return (linkhmap.get(pincode));
    }

    public void deleteDetailsLinkedhashmap(String pincode)
    {
        linkhmap.remove(pincode);
    }

    public boolean containsKeyLinkedhashmap(String pincode)
    {
        return linkhmap.containsKey(pincode);
    }

    public void iterateLinkedhashmapMethod1()
    {
        Collection<PinCodeUserInfo> ci=linkhmap.values();
        ArrayList<PinCodeUserInfo> as = new ArrayList<>(ci);
        for(PinCodeUserInfo pi:as)
        {
            System.out.println(pi.getCountry());
        }
    }

    public void iterateLinkedhashmapMethod2()
    {
        Iterator i=linkhmap.keySet().iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }

    public void iterateLinkedhashmapMethod3()
    {
        Set s=linkhmap.entrySet();
        Iterator i= s.iterator();

        while(i.hasNext())
        {
            Map.Entry mp = (Map.Entry)(i.next());
            System.out.println((String)mp.getKey());
            // mp.getValue();
        }
    }
    public void iterateLinkedhashmapMethod4()
    {
       linkhmap.forEach((key,value) -> System.out.println(key + " " + value));
      // linkhmap.forEach((key,value) -> System.out.println(key + "" + value));
      //  linkhmap.forEach((key,value) ->System.out.println(key + " " + value));
    //    hmap.forEach((key,value) ->System.out.println(key + value));

        //hmap.forEach((key,value) -> System.out.println(key + value));

    }

    //hashtable
    public void pincoderegisterHashtablee(PinCodeUserInfo pinCodeUserInfo)
    {
        htab.put(pinCodeUserInfo.getPinCode(),pinCodeUserInfo);
    }

    public PinCodeUserInfo retreiveDetailsHashtable(String pincode)
    {
        return (htab.get(pincode));
    }

    public void deleteDetailsHashTab(String pincode)
    {
        htab.remove(pincode);
    }

    public boolean containsKeyHashtable(String pincode)
    {
     return htab.containsKey(pincode);
    }

    public void iterateHashTableMethod1()
    {
        Collection<PinCodeUserInfo> ci=htab.values();
        ArrayList<PinCodeUserInfo> as = new ArrayList<>(ci);
        for(PinCodeUserInfo pi:as)
        {
            System.out.println(pi.getCountry());
        }
    }

    public void iterateHashTableMethod2()
    {
        Iterator i=htab.keySet().iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }

    public void iterateHashTableMethod3()
    {
        Set s=htab.entrySet();
        Iterator i= s.iterator();

        while(i.hasNext())
        {
            Map.Entry mp = (Map.Entry)(i.next());
            System.out.println((String)mp.getKey());
           // mp.getValue();
        }
    }
    public void iterateHashTableMethod4()
    {
      for(Map.Entry<String,PinCodeUserInfo> en :htab.entrySet())
      {
          System.out.println(en.getKey() + " " + en.getValue());
      }
    }

// hashmap
    public void pinCodeRegister(PinCodeUserInfo pinCodeUserInfo) {
        hmap.put(pinCodeUserInfo.getPinCode(), pinCodeUserInfo);

    }

    public PinCodeUserInfo retreievDetails(String pincode) {
        return (hmap.get(pincode));
    }

    public void deleteDetails(String pincode) {
        hmap.remove(pincode);
    }

    public boolean containsKey(String pincode) {
        return (hmap.containsKey(pincode));
    }

    public boolean isDelievrable(String pincode) {
        if (hmap.containsKey(pincode)) {
            PinCodeUserInfo pinCodeUserInfo1 = hmap.get(pincode);
            return pinCodeUserInfo1.isDeliverable();

        } else {
            return false;
        }


    }

    public List<String> getPincodes() {
        Set s = hmap.entrySet();
        Iterator i = s.iterator();
        List<String> as = new ArrayList<>();
        while (i.hasNext()) {
            Map.Entry mp = (Map.Entry) i.next();
            as.add((String) mp.getKey());
        }
        return as;

    }
/*
    public List<PinCodeUserInfo> getAllInfo() {
        // method-1
        Collection<PinCodeUserInfo> pinCodeUserInfoCollection = hmap.values();
        List<PinCodeUserInfo> list = new ArrayList<>(pinCodeUserInfoCollection);
        return list;
    }

    public List<PinCodeUserInfo> getAllInfo_2() {
       List<PinCodeUserInfo> list = new ArrayList<>();
        for (String s : this.hmap.keySet()) {
            list.add(this.hmap.get(s));
        }
        return list;
    }

    public List<PinCodeUserInfo> getAllInfo_3(){
        List<PinCodeUserInfo> list = new ArrayList<>();
        Iterator<Map.Entry<String, PinCodeUserInfo>> iterator = this.hmap.entrySet().iterator();
        while (iterator.hasNext()){
            Map.Entry<String, PinCodeUserInfo> entry = iterator.next();
            list.add(entry.getValue());
        }

        return list;
    }
*/

    public ArrayList<PinCodeUserInfo> retListAllInfo()
    {
        Collection<PinCodeUserInfo> cpin= hmap.values();
       ArrayList<PinCodeUserInfo> as= new ArrayList<>(cpin );
       return as;
    }

    public List<String> retListKeys_all()
    {
        List<String> ls= new ArrayList<String>();
        List<PinCodeUserInfo> lsp= new ArrayList<>();
        Iterator<String> i=hmap.keySet().iterator();
        while(i.hasNext())
        {
            ls.add(i.next());
            lsp.add(hmap.get(i.next()));
        }
        System.out.println(lsp);
        return ls;
    }

    public List<PinCodeUserInfo> getAllInfo()
    {
        List<PinCodeUserInfo> ls= new ArrayList<>();
        List<String> lsp= new ArrayList<>();

        Set s=hmap.entrySet();
        Iterator i= s.iterator();
        while(i.hasNext())
        {
            Map.Entry mp = (Map.Entry) (i.next());
            lsp.add((String) mp.getKey());
            ls.add((PinCodeUserInfo) mp.getValue());
        }
        return ls;
    }

    public HashMap<String,PinCodeUserInfo> clubTwoListAsMap(ArrayList s1, ArrayList s2)
    {
        Iterator<String> is= s1.iterator();
        Iterator<PinCodeUserInfo> ip = s2.iterator();

        while(is.hasNext() && ip.hasNext())
        {
            hmap.put(is.next(),ip.next());
        }

        return hmap;
    }


    public List<HashMap<String,PinCodeUserInfo>> listOfHashMap(HashMap hmap2)
    {
        List<HashMap<String,PinCodeUserInfo>> lsHash= new ArrayList<>();
        lsHash.add(hmap);
        lsHash.add(hmap2);

        return lsHash;

    }

    public HashMap<String,PinCodeUserInfo> updateValue(String key1,String newState)
    {
        if(hmap.containsKey(key1))
        {
            PinCodeUserInfo pis= hmap.get(key1);
            pis.setState(newState);

        }
        return hmap;
    }

    public HashMap<String,PinCodeUserInfo> sortedHashMap_1()
    {// ascending order
        TreeMap<String,PinCodeUserInfo> tm = new TreeMap<>(hmap);
        HashMap<String,PinCodeUserInfo> sortedhas= new HashMap<>(tm);
        return(sortedhas);

    }

    public Hashtable<String,PinCodeUserInfo> sortedHashTable()
    {
        TreeMap<String,PinCodeUserInfo> tmap = new TreeMap<>(htab);
        Hashtable<String,PinCodeUserInfo> htab1= new Hashtable<>(tmap);
        return htab1;
    }

    public LinkedHashMap<String,PinCodeUserInfo> sortedLinkedHashmap()
    {
        TreeMap<String,PinCodeUserInfo> tmap = new TreeMap<>(htab);
        LinkedHashMap<String,PinCodeUserInfo> htab1= new LinkedHashMap<>(tmap);
        return htab1;
    }


    public HashMap<String,PinCodeUserInfo> sortedHashMap_2()
    {// descending order
        TreeMap<String,PinCodeUserInfo> tm = new TreeMap<>(Collections.reverseOrder());
        tm.putAll(hmap);
        HashMap<String,PinCodeUserInfo> hsorted = new HashMap<>(tm);

        return hsorted;

    }

    public static void main(String[] args) {
        PinCodeUserInfo doi = new PinCodeUserInfo("248140", "uk", "India", true);
        HashMapIterate hashMapIterate = new HashMapIterate();

        hashMapIterate.pinCodeRegister(doi);
        PinCodeUserInfo a = hashMapIterate.retreievDetails(doi.getPinCode());
        System.out.println(a.isDeliverable());

        hashMapIterate.deleteDetails(doi.getPinCode());
        System.out.println(hashMapIterate.containsKey(doi.getPinCode()));
        System.out.println(hashMapIterate.isDelievrable(doi.getPinCode()));

        // taking keys and values into list

        hashMapIterate.pinCodeRegister(doi);
        List<PinCodeUserInfo> pc= hashMapIterate.getAllInfo();
        for(PinCodeUserInfo p: pc)
        {
            System.out.println( p.getState());
        }

        List<String> ls =hashMapIterate.getPincodes();
        for(String x: ls)
        {
            System.out.println(ls.toString());
        }
        // send two aarraylist and put it in hmap
        ArrayList<PinCodeUserInfo> ps= new ArrayList<PinCodeUserInfo>();
        ps.add(doi);
        ArrayList<String> st= new ArrayList<String>();
        st.add(doi.getPinCode());

        HashMap<String,PinCodeUserInfo> hmap2=hashMapIterate.clubTwoListAsMap(st,ps);
        Iterator i=hmap2.keySet().iterator();
        while(i.hasNext())
        {
            String x =  (String)i.next();
            System.out.println(x);
            PinCodeUserInfo ps1=(PinCodeUserInfo) hmap2.get(x);
           System.out.println(ps1.getState());

        }

        List<HashMap<String,PinCodeUserInfo>> lsHas=hashMapIterate.listOfHashMap(hmap2);
        for(HashMap<String,PinCodeUserInfo> hs: lsHas)
        {
            Set s=hs.entrySet();
            Iterator is= s.iterator();
            while(is.hasNext())
            {
              Map.Entry mp1= (Map.Entry)  is.next();
                System.out.println((String)mp1.getKey());

                PinCodeUserInfo pip= (PinCodeUserInfo) mp1.getValue();
                System.out.println(pip.getCountry());
              //  System.out.println((PinCodeUserInfo)mp1.getValue());
            }
        }

        HashMap<String,PinCodeUserInfo> pi =hashMapIterate.updateValue("248140","UP");
      Collection<PinCodeUserInfo> x=pi.values();
      ArrayList<PinCodeUserInfo> as = new ArrayList<>(x);
      for(PinCodeUserInfo pi1: as)
      {
          System.out.println(pi1.getState());
      }

        PinCodeUserInfo doi1 = new PinCodeUserInfo("248001", "uk", "India", true);
        hashMapIterate.pinCodeRegister(doi1);
        Iterator<String> is=hashMapIterate.sortedHashMap_1().keySet().iterator();
        while(is.hasNext())
        {
            System.out.println(is.next());
        }

        Iterator<String> is1=hashMapIterate.sortedHashMap_2().keySet().iterator();
        while(is1.hasNext())
        {
            System.out.println(is1.next());
        }
//hashtable
       hashMapIterate.pincoderegisterHashtablee(doi);
        hashMapIterate.pincoderegisterHashtablee(doi1);

        hashMapIterate.containsKeyHashtable("248140");
        hashMapIterate.retreiveDetailsHashtable("248140");
        hashMapIterate.iterateHashTableMethod1();
        hashMapIterate.iterateHashTableMethod2();
        hashMapIterate.iterateHashTableMethod3();
        hashMapIterate.iterateHashTableMethod4();
//linkedhashmap
        hashMapIterate.pincoderegisterLinkedhashmap(doi);
        hashMapIterate.pincoderegisterLinkedhashmap(doi1);
        hashMapIterate.containsKeyLinkedhashmap("248140");
        hashMapIterate.deleteDetailsLinkedhashmap("248140");
        hashMapIterate.iterateLinkedhashmapMethod1();
        hashMapIterate.iterateLinkedhashmapMethod2();
        hashMapIterate.iterateLinkedhashmapMethod3();
        hashMapIterate.iterateLinkedhashmapMethod4();


    }
}
