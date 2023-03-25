package main.java.model;

import javafx.collections.ModifiableObservableListBase;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Playlist extends ModifiableObservableListBase<main.java.interfaces.Song> implements main.java.interfaces.Playlist{

    private List<main.java.interfaces.Song> mList = new ArrayList<main.java.interfaces.Song>();

    @Override
    public boolean addSong(main.java.interfaces.Song s) throws RemoteException {



        return mList.add(s);
    }

    @Override
    public boolean deleteSong(main.java.interfaces.Song s) throws RemoteException {



        return mList.remove(s);
    }

    @Override
    public boolean deleteSongByID(long id) throws RemoteException {
        return false;
    }

    @Override
    public void setList(ArrayList<interfaces.Song> s) throws RemoteException {

    }

    @Override
    public ArrayList<interfaces.Song> getList() throws RemoteException {
        return null;
    }


    @Override
    public void clearPlaylist() throws RemoteException {

    }

    @Override
    public int sizeOfPlaylist() throws RemoteException {
        return 0;
    }

    @Override
    public Song findSongByPath(String name) throws RemoteException {
        return null;
    }

    @Override
    public Song findSongByID(long id) throws RemoteException {
        return null;
    }


    @Override
    public interfaces.Song get(int index) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    protected void doAdd(int index, interfaces.Song element) {

    }

    @Override
    protected interfaces.Song doSet(int index, interfaces.Song element) {
        return null;
    }

    @Override
    protected interfaces.Song doRemove(int index) {
        return null;
    }
}
