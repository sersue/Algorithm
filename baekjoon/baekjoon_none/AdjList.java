import java.util.*;


private static class AdjList {        
    
   private ArrayList <ArrayList<Integer>> adjList;

   AdjList(int size){
       adjList=new ArrayList <ArrayList<Integer>>();
   }

    void printGraph(String args[]){

        insertSingle(1,2);
        insertSingle(2,3);
        insertSingle(3,4);
        insertSingle(5,4);
        insertSingle(6,5);

        for(int i=0;i<adjList.size();i++){
            System.out.println(i+"의 리스트");
            for(int j=0;j<adjList.get(i).size();i++){
                System.out.println(adjList.get(i).get(j));

            }
        }
       
        
    }    
     /*단방향그래프 */
     public void insertSingle(int edge1,int edge2){
         adjList.get(edge1).add(edge2); //1,2 넣으면 1위치에 2 넣음
     }
     /*양방향그래프 */
     public void insertBidirectional(int edge1,int edge2){
        adjList.get(edge1).add(edge2); //1,2 넣으면 1위치에 2 넣음
        adjList.get(edge2).add(edge1);
     }

     //특정노드 가져오기
     public ArrayList<Integer> getNode(int index){
         return adjList.get(index);
     }
     //그래프 가져오기
     public ArrayList <ArrayList<Integer>> getGraph(){
        return adjList;
    }
}
