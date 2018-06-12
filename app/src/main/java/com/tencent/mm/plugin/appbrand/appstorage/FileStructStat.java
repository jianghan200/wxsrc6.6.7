package com.tencent.mm.plugin.appbrand.appstorage;

public final class FileStructStat
{
  public long st_atime;
  public long st_ctime;
  public int st_mode;
  public long st_mtime;
  public long st_size;
  
  public final void fillAnother(FileStructStat paramFileStructStat)
  {
    if (paramFileStructStat == null) {
      return;
    }
    paramFileStructStat.st_mode = this.st_mode;
    paramFileStructStat.st_size = this.st_size;
    paramFileStructStat.st_atime = this.st_atime;
    paramFileStructStat.st_mtime = this.st_mtime;
    paramFileStructStat.st_ctime = this.st_ctime;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/appbrand/appstorage/FileStructStat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */