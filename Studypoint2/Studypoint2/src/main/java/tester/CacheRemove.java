/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tester;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Pravien
 */
public class CacheRemove extends Thread
{
    Tester test;
    List<Group> groups = new ArrayList();
    public CacheRemove(Tester test){
        this.test = test;
    }
    public void run(){
        try
        {
            while(true){
            groups=test.fetchData();
            TimeUnit.SECONDS.sleep(5);
                System.out.println("yo");
            }
            
            
        } catch (InterruptedException ex)
        {
        } catch (ExecutionException ex)
        {
        }
    }

    public List<Group> getGroups()
    {
        return groups;
    }

    public void setGroups(List<Group> groups)
    {
        this.groups = groups;
    }
    
    
}
