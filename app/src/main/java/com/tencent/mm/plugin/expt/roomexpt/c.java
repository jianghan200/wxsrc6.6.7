package com.tencent.mm.plugin.expt.roomexpt;

final class c
  implements Comparable<c>
{
  String bIY;
  float iIx;
  String nickname;
  
  public final String toString()
  {
    return String.format("chatroom[%s %s] score[%f]", new Object[] { this.bIY, this.nickname, Float.valueOf(this.iIx) });
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/plugin/expt/roomexpt/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */