package main.java.interfaces;

import java.io.Serializable;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;


public interface  Playlist extends Remote, Serializable, Iterable<main.java.interfaces.Song>{
    boolean addSong(main.java.interfaces.Song s) throws RemoteException;
    boolean deleteSong(main.java.interfaces.Song s) throws RemoteException;
    boolean deleteSongByID(long id) throws RemoteException;
    void setList(ArrayList<main.java.interfaces.Song> s) throws RemoteException;
    ArrayList<main.java.interfaces.Song> getList() throws RemoteException;
    void clearPlaylist() throws RemoteException;
    int sizeOfPlaylist() throws RemoteException;
    main.java.interfaces.Song findSongByPath(String name) throws RemoteException;
    main.java.interfaces.Song findSongByID(long id) throws RemoteException;
}
