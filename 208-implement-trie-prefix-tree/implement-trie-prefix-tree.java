class Trie {

    // Trie Node class
    class TrieNode {
        TrieNode[] children = new TrieNode[26]; // for 26 lowercase letters
        boolean isEndOfWord = false; // to mark end of a word
    }

    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie
    public void insert(String word) {
        TrieNode node = root;

        for (char c : word.toCharArray()) {
            int index = c - 'a'; // map 'a'-'z' to 0-25

            if (node.children[index] == null) {
                node.children[index] = new TrieNode(); // create node if absent
            }

            node = node.children[index]; // move to next node
        }

        node.isEndOfWord = true; // mark end of the word
    }

    // Returns true if word is in the trie
    public boolean search(String word) {
        TrieNode node = root;

        for (char c : word.toCharArray()) {
            int index = c - 'a';

            if (node.children[index] == null) {
                return false; // letter path doesn't exist
            }

            node = node.children[index];
        }

        return node.isEndOfWord; // return true only if it's end of a word
    }

    // Returns true if any word in the trie starts with the given prefix
    public boolean startsWith(String prefix) {
        TrieNode node = root;

        for (char c : prefix.toCharArray()) {
            int index = c - 'a';

            if (node.children[index] == null) {
                return false;
            }

            node = node.children[index];
        }

        return true; // prefix path exists
    }
}
