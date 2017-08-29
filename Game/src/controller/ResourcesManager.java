package controller;
/**
 *  This class is responsible for getting the data for the manager of the interface.
 *
 *
 * */
public class ResourcesManager {
    private static ResourcesManager manager ;

    private ResourcesManager(){

    }
    public ChapterManager loadChapter(int level){
        return null;
    }

    public ResourcesManager getInstance(){
        if(manager == null){
            manager = new ResourcesManager();
        }
        return manager;
    }
}
