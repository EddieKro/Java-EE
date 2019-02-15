package ua.com.di.entities;

import java.util.List;


public class CollectionDocs {
    private List docs;

    private List getDocs() {
        return docs;
    }

    public void setDocs(List docs) {
        this.docs = docs;
    }

    public String toString() {
        String res = "";
        for (Object doc : docs)
            res = res.concat(doc + "\n");
        return res;
    }

}
