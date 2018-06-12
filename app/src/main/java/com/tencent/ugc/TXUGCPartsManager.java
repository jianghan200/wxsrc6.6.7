package com.tencent.ugc;

import android.os.AsyncTask;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class TXUGCPartsManager
{
  private ArrayList<a> iPartsManagerObservers = new ArrayList();
  private int mDuration;
  private CopyOnWriteArrayList<PartInfo> mPartsList = new CopyOnWriteArrayList();
  
  private void callbackDeleteAllParts()
  {
    try
    {
      Iterator localIterator = this.iPartsManagerObservers.iterator();
      while (localIterator.hasNext()) {
        ((a)localIterator.next()).b();
      }
    }
    finally {}
  }
  
  private void callbackDeleteLastPart()
  {
    try
    {
      Iterator localIterator = this.iPartsManagerObservers.iterator();
      while (localIterator.hasNext()) {
        ((a)localIterator.next()).a();
      }
    }
    finally {}
  }
  
  private void deleteFile(String paramString)
  {
    new TXUGCPartsManager.1(this, paramString).executeOnExecutor(AsyncTask.SERIAL_EXECUTOR, new Object[0]);
  }
  
  public void addClipInfo(PartInfo paramPartInfo)
  {
    this.mPartsList.add(paramPartInfo);
    this.mDuration = ((int)(this.mDuration + paramPartInfo.getDuration()));
  }
  
  public void deleteAllParts()
  {
    Iterator localIterator = this.mPartsList.iterator();
    while (localIterator.hasNext()) {
      deleteFile(((PartInfo)localIterator.next()).getPath());
    }
    this.mPartsList.clear();
    this.mDuration = 0;
    callbackDeleteAllParts();
  }
  
  public void deleteLastPart()
  {
    if (this.mPartsList.size() != 0)
    {
      PartInfo localPartInfo = (PartInfo)this.mPartsList.remove(this.mPartsList.size() - 1);
      this.mDuration = ((int)(this.mDuration - localPartInfo.getDuration()));
      deleteFile(localPartInfo.getPath());
      callbackDeleteLastPart();
    }
  }
  
  public void deletePart(int paramInt)
  {
    if (paramInt <= 0) {}
    while (this.mPartsList.size() == 0) {
      return;
    }
    PartInfo localPartInfo = (PartInfo)this.mPartsList.remove(paramInt - 1);
    this.mDuration = ((int)(this.mDuration - localPartInfo.getDuration()));
    deleteFile(localPartInfo.getPath());
  }
  
  public int getDuration()
  {
    return this.mDuration;
  }
  
  public List<String> getPartsPathList()
  {
    ArrayList localArrayList = new ArrayList();
    Iterator localIterator = this.mPartsList.iterator();
    while (localIterator.hasNext()) {
      localArrayList.add(((PartInfo)localIterator.next()).getPath());
    }
    return localArrayList;
  }
  
  public void removePartsManagerObserver(a parama)
  {
    if (parama != null) {}
    try
    {
      this.iPartsManagerObservers.remove(parama);
      return;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  public void setPartsManagerObserver(a parama)
  {
    if (parama != null) {}
    try
    {
      if (!this.iPartsManagerObservers.contains(parama)) {
        this.iPartsManagerObservers.add(parama);
      }
      return;
    }
    finally
    {
      parama = finally;
      throw parama;
    }
  }
  
  public static abstract interface a
  {
    public abstract void a();
    
    public abstract void b();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/ugc/TXUGCPartsManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */