package com.tencent.tmassistantsdk.storage;

import com.tencent.tmassistantsdk.downloadservice.DownloadInfo;
import com.tencent.tmassistantsdk.downloadservice.taskmanager.ServiceDownloadTask;
import com.tencent.tmassistantsdk.storage.table.ClientInfoTable;
import com.tencent.tmassistantsdk.storage.table.DownloadInfoTable;
import java.util.ArrayList;

public class DBManager
{
  protected static DBManager mInstance = null;
  
  public static DBManager getInstance()
  {
    try
    {
      if (mInstance == null) {
        mInstance = new DBManager();
      }
      DBManager localDBManager = mInstance;
      return localDBManager;
    }
    finally {}
  }
  
  public void addDownloadInfo(DownloadInfo paramDownloadInfo)
  {
    DownloadInfoTable.add(paramDownloadInfo);
  }
  
  public void deleteDownloadInfo(String paramString)
  {
    DownloadInfoTable.del(paramString);
    ClientInfoTable.deleteItemsByURL(paramString);
  }
  
  public DownloadInfo queryDownloadInfoByUrl(String paramString)
  {
    return DownloadInfoTable.query(paramString);
  }
  
  public ArrayList<DownloadInfo> queryDownloadInfoList()
  {
    return DownloadInfoTable.load();
  }
  
  public ArrayList<ServiceDownloadTask> queryWaitingAndDownloadingTaskList()
  {
    return DownloadInfoTable.query();
  }
  
  public void saveClientInfo(String paramString1, String paramString2)
  {
    ClientInfoTable.save(paramString1, paramString2);
  }
  
  public void saveDownloadInfoList(ArrayList<DownloadInfo> paramArrayList)
  {
    DownloadInfoTable.save(paramArrayList);
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/tmassistantsdk/storage/DBManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */