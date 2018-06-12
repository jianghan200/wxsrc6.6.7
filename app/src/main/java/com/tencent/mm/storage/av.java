package com.tencent.mm.storage;

public final class av
{
  public static final av tbm = new av("timeline");
  public static final av tbn = new av("album_friend");
  public static final av tbo = new av("album_self");
  public static final av tbp = new av("album_stranger");
  public static final av tbq = new av("profile_friend");
  public static final av tbr = new av("profile_stranger");
  public static final av tbs = new av("comment");
  public static final av tbt = new av("comment_detail");
  public static final av tbu = new av("other");
  public static final av tbv = new av("snssight");
  public static final av tbw = new av("fts");
  public String tag = "";
  public int time = 0;
  
  public av(String paramString)
  {
    this.tag = paramString;
  }
  
  public static av a(av paramav, int paramInt)
  {
    paramav = new av(paramav.tag);
    paramav.time = paramInt;
    return paramav;
  }
  
  public static av clT()
  {
    return new av("timeline");
  }
  
  public static av clU()
  {
    return new av("album_friend");
  }
  
  public static av clV()
  {
    return new av("album_self");
  }
  
  public static av clW()
  {
    return new av("album_stranger");
  }
  
  public static av clX()
  {
    return new av("comment_detail");
  }
  
  public static av clY()
  {
    return new av("snssight");
  }
  
  public final av Dm(int paramInt)
  {
    this.time = paramInt;
    return this;
  }
  
  public final boolean equals(Object paramObject)
  {
    if ((paramObject instanceof av)) {
      return ((av)paramObject).tag.equals(this.tag);
    }
    return super.equals(paramObject);
  }
  
  public final String toString()
  {
    return this.tag + "@" + this.time;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/storage/av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */