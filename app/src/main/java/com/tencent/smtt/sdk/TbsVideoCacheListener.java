package com.tencent.smtt.sdk;

import android.os.Bundle;

public abstract interface TbsVideoCacheListener
{
  public abstract void onVideoDownloadCompletion(TbsVideoCacheTask paramTbsVideoCacheTask, long paramLong1, long paramLong2, Bundle paramBundle);
  
  public abstract void onVideoDownloadError(TbsVideoCacheTask paramTbsVideoCacheTask, int paramInt, String paramString, Bundle paramBundle);
  
  public abstract void onVideoDownloadInit(TbsVideoCacheTask paramTbsVideoCacheTask, int paramInt, String paramString, Bundle paramBundle);
  
  public abstract void onVideoDownloadProgress(TbsVideoCacheTask paramTbsVideoCacheTask, int paramInt1, long paramLong, int paramInt2, Bundle paramBundle);
  
  public abstract void onVideoDownloadStart(TbsVideoCacheTask paramTbsVideoCacheTask, Bundle paramBundle);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/smtt/sdk/TbsVideoCacheListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */