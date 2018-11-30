package tamil.com.retrofit.Model;

import java.util.List;

public class GetAndroidList {

    List<Item> android;


    public List<Item> getAndroid() {
        return android;
    }

    public void setAndroid(List<Item> android) {
        this.android = android;
    }

    public class Item {

        String ver;
        String name;
        String api;


        public String getVer() {
            return ver;
        }

        public void setVer(String ver) {
            this.ver = ver;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getApi() {
            return api;
        }

        public void setApi(String api) {
            this.api = api;
        }
    }
}
