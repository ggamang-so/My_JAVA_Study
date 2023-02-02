package test06.linkedlist;

public class Data {

        private Integer no;
        private String name;


        public Integer getNo() {
            return no;
        }

        public void setNo(Integer no) {
            this.no = no;
        }

        public String getName() { return name; }

        public void setName(String name) {
            this.name = name;
        }


        Data(){

        }
        public String toString(){
            return no +" : "+ name;
        }
    }

