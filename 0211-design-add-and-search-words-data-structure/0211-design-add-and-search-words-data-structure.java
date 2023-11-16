class WordDictionary {
    public Set<String> dict;
    public WordDictionary() {
        dict = new HashSet<>();
    }
    
    public void addWord(String word) {
        dict.add(word);
    }
    
    public boolean search(String word) {
        if (word.contains(".")) {
            for(String data : dict) {
                if (data.length() != word.length()) {
                    continue;
                }
                for(int i = 0; i< data.length(); i++) {
                    char wc = word.charAt(i);
                    char dc = data.charAt(i);

                    if (wc != '.' && wc != dc) {
                        break;
                    }
                    if (i == data.length() -1) {
                        return true;
                    }
                }
            }
        }
        if (dict.contains(word)) {
            return true;
        }
        return false;
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */