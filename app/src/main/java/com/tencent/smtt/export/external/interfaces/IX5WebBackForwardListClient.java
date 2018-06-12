package com.tencent.smtt.export.external.interfaces;

public abstract interface IX5WebBackForwardListClient
{
  public abstract void onIndexChanged(IX5WebHistoryItem paramIX5WebHistoryItem, int paramInt);
  
  public abstract void onNewHistoryItem(IX5WebHistoryItem paramIX5WebHistoryItem);
  
  public abstract void onRemoveHistoryItem(IX5WebHistoryItem paramIX5WebHistoryItem);
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/smtt/export/external/interfaces/IX5WebBackForwardListClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */