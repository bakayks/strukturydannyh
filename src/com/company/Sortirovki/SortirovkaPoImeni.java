package com.company.Sortirovki;
import java.io.*;
import java.util.ArrayList;


public class SortirovkaPoImeni {
    public static void main(String[] args) throws IOException {
        ArrayList<String> s = new ArrayList<>();

            FileInputStream fstream = new FileInputStream("C:/текст1.txt");
            BufferedReader br = new BufferedReader(new InputStreamReader(fstream));
            String strLine;
            while ((strLine = br.readLine()) != null){
                s.add(strLine);
            }
        String[] strings = {"А","Б","В","Г","Д","Е","Ё","Ж","З","И","Й","К","Л","М","Н","О","П","Р","С","Т","У","Ф","Х","Ц","Ч","Ш", "Щ", "Ь", "Ъ", "Э", "Ю", "Я"};
        int n = s.size();
        for(int i = 0; i < n-1; i++) {
            for (int j = 0; j < n - i - 1;j++) {
                int pervInd = 0;
                int vtorInd = 0;
                for (int z = 0; z < strings.length - 1; z++) {
                    if (s.get(j).charAt(0) == strings[z].charAt(0)) {
                        pervInd = z;
                    }else if (s.get(j + 1).charAt(0) == strings[z].charAt(0)) {
                        vtorInd = z;
                    }
                }
                if (pervInd > vtorInd) {
                    String per = s.get(j);
                    s.set(j, s.get(j + 1));
                    s.set(j + 1, per);
                }
            }
        }
        for (int p = 0; p < s.size() - 1; p++) {
            System.out.println(s.get(p));
        }
    }

}