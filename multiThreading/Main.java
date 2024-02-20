

/*
 * Problem statement You are given a complete, balanced M-Ary Tree and must
 * support Q queries. There are 3 kinds of queries. Return true or false
 * depending on whether the query was successful.
 * 
 * Lock(v, id) - Lock vertex v for user - id Unlock(v, id) - If vertex v is
 * locked by the same id, unlock it. Upgrade(v, id) - If v is unlocked and has
 * at least one locked vertex in it's subtree and every locked vertex in the
 * subtree of v is locked by id, unlock them and lock v instead. Further, here
 * are some additional constraints
 * 
 * A vertex cannot be locked if it has any locked ancestors or descendants, by
 * any ID. When a vertex is upgraded, it's locked descendants are automatically
 * unlocked. An upgrade operation is not possible if the vertex is already
 * locked or has any locked ancestors An unlock operation is only possible if
 * the vertex is already locked and locked by the same id P.S. - The question
 * was very badly stated and not a single constraint was mentioned openly on the
 * problem statement. A lot of these constraints had to be deduced by supplying
 * custom input and observing the expected output. There were no constraints on
 * the size of the variables.
 * 
 */

/*
 * Let’s say you are running the lock/unlock in a multi core machine. Now you
 * want to let multiple threads to run lock() As we saw in part A, locking a
 * node has multiple validations inside. Will doing lock on two nodes cause a
 * race condition. If yes, how will you solve it. In short, how do make the
 * lock() function thread safe? - Multiple threads running it simultaneously
 * shouldn’t not affect the correctness. -Try to make the critical sections more
 * granular. ie. don’t create any big atomic/synchronised blocks that will make
 * parallelism suffer.
 */




import java.util.*;

class TreeNode {
    String name;
    int lockedBy;
    int LockCount;
    List<TreeNode> childs;
    TreeNode parent;
    Set<TreeNode> lockedDescendents;

    TreeNode(String nm, TreeNode par) {
        name = nm;
        lockedBy = -1;
        parent = par;
        LockCount = 0;
        childs = new ArrayList<>();
        lockedDescendents = new HashSet<>();
    }

    void addChild(List<String> a) {
        for (String nm : a) {
            childs.add(new TreeNode(nm, this));
        }
    }
}

class MAryTree {
    TreeNode root;
    Map<String, TreeNode> nameToTreeNodeMapping;

    MAryTree(String name) {
        root = new TreeNode(name, null);
        nameToTreeNodeMapping = new HashMap<>();
    }
    
    
	
    void makeMArtTree(List<String> a, int m) {
        Queue<TreeNode> q = new LinkedList<>();
        int k = 1, i, n = a.size();
        q.add(root);
        while (!q.isEmpty()) {
            TreeNode r = q.poll();
            nameToTreeNodeMapping.put(r.name, r);
            List<String> b = new ArrayList<>();
            for (i = k; i < Math.min(n, k + m); i++) {
                b.add(a.get(i));
            }
            r.addChild(b);
            for (TreeNode child : r.childs) {
                q.add(child);
            }
            k = i;
        }
    }
    
    
    boolean lock(String name ,int id){
        TreeNode r = nameToTreeNodeMapping.get(name);
        if(r.LockCount > 0 || r.lockedDescendents.size() > 0){
            return false;
        }
        
        r.LockCount++;
        if(r.LockCount > 1){
            r.LockCount--;
            return false;
        }
        
        TreeNode par = r.parent;
        while(par != null){
            if(par.LockCount > 0 || r.lockedDescendents.size() > 0  ){
                r.LockCount--;
                TreeNode t1 = r.parent;
                while(t1 != par){
                     par.lockedDescendents.remove(r);
                    par = par.parent;
                }
                return false;
            }
            par.lockedDescendents.add(r);
            par = par.parent;
        }
        
        r.lockedBy = id ;
        return true;
    }
    

  boolean unlock(String name, int id) {
        TreeNode r = nameToTreeNodeMapping.get(name);
        if (r.LockCount > 0 || r.lockedBy != id) return false;
        TreeNode par = r.parent;
        while (par != null) {
            par.lockedDescendents.remove(r);
            par = par.parent;
        }
        r.LockCount = 0;
        r.lockedBy = -1;
        return true;
    }

    boolean upgradeLock(String name, int id) {
        TreeNode r = nameToTreeNodeMapping.get(name);
        if (r.LockCount > 0  || r.lockedDescendents.isEmpty()) return false;
        for (TreeNode ld : r.lockedDescendents) {
            if (ld.lockedBy != id) return false;
        }
        TreeNode par = r.parent;
        while (par != null) {
            if (par.LockCount > 0) return false;
            par = par.parent;
        }
        Set<TreeNode> stt = new HashSet<>(r.lockedDescendents);
        for (TreeNode ld : stt) {
            unlock(ld.name, id);
        }
        lock(name, id);
        return true;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int t = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        List<String> a = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            a.add(scanner.nextLine());
        }

        MAryTree tree = new MAryTree(a.get(0));
        tree.makeMArtTree(a, m);



        while (t-- > 0) {
            int opType = scanner.nextInt();
            String name = scanner.next();
            int id = scanner.nextInt();
            String result = "";
            if (opType == 1) {
              
                //     Thread t1 = new Thread(()->{
                //         System.out.println(" lock Inside thread one start");
                //         boolean v = tree.lock("Asia", id);
                //         System.out.println( "Thread one" + v);
                //         System.out.println(" lock Inside thread one end");
                //     });
                   
                // //   try {
                //             t1.join();
                //         } catch (InterruptedException e) {
                //             e.printStackTrace();
                //         }
                    
                    //  Thread t2 = new Thread(()->{
                        
                    //     boolean v = tree.lock(name, id);
                    //     System.out.println("Thread two " + v);
                        
                    // });
                    
                    // Thread t3 = new Thread(()->{
                        
                    //     boolean v = tree.lock("Asia", id);
                    //     System.out.println("Thread three " + v);
                      
                    // });
                    // //  t1.start();
                    // t2.start();
                    // t3.start();
                    
                    System.out.println(tree.lock(name, id));
                    
                    
                    // try {
                    //         t2.join();
                    //     } catch (InterruptedException e) {
                    //         e.printStackTrace();
                    //     }
                    //System.out.println("fsdlfkslfjsl;k");
            } else if (opType == 2) 
                    System.out.println("unlock " + tree.unlock(name, id));
             else if (opType == 3) 
                System.out.println("upgrade  " + tree.upgradeLock(name, id));
            
            
            
        }
    }
        
}
