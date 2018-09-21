public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
               String s = new Scanner(System.in).nextLine();
               HashMap<Character,Integer> map = new HashMap(26);
               for(Character c : s.toCharArray())
               {
                   if(map.containsKey(c))
                   {
                       int val = map.get(c);
                       map.put(c,++val);
                   }
                   else
                   {
                       map.put(c,1);
                   }
               }
               int min = Collections.min(map.values());
               int max = Collections.max(map.values());
               HashMap<Integer,Integer> intMap = new HashMap();
               for(int count : map.values())
               {
                  Integer val = intMap.get(count);
                   if(null != val)
                       {
                       intMap.put(count,++val);
                   }
                   else
                       {
                       intMap.put(count,1);
                   }
               }

               String output= intMap.size() == 1  ||( intMap.size() <= 2 && (intMap.get(min) <= 1 || intMap.get(max) <= 1)) ? "YES" : "NO";
               System.out.println(output);
        }

///"YES " for aabbccccc