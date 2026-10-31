class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) {
            return "|";
        }
        StringBuilder string = new StringBuilder();

        for(String s : strs){
            string.append(s).append("`");
        }

        if(string.length() > 0){
            string.setLength(string.length() - 1);
        }


        System.out.println("StringBuilder: " + string);
        return string.toString();
    }

    public List<String> decode(String str) { // str - Hello#World#
    if (str.equals("|")) {
        return new ArrayList<>();
    }

// Input
// strs=[""]
// Your Output

// []
// Expected Output

// [""]
// Debug Logs



// Input

// strs=[]
// Your Output

// [""]
// Expected Output

// []
// Debug Logs

// StringBuilder: 
// []
        
        List<String> list = Arrays.stream(str.split("`", -1))
            .toList();

            System.out.print(list);
        return list;
    }
}
