package com.tencent.mm.plugin.chatroom.d;

import java.util.Calendar;

public final class a
{
  public long bJC;
  private Calendar calendar;
  public int day;
  public long hKT;
  public int month;
  public int year;
  
  public a()
  {
    setTime(System.currentTimeMillis());
  }
  
  public a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.year = paramInt1;
    this.month = paramInt2;
    this.day = paramInt3;
  }
  
  public a(long paramLong)
  {
    this.hKT = paramLong;
    setTime(paramLong);
  }
  
  private void setTime(long paramLong)
  {
    this.hKT = paramLong;
    if (this.calendar == null) {
      this.calendar = Calendar.getInstance();
    }
    this.calendar.setTimeInMillis(paramLong);
    this.month = this.calendar.get(2);
    this.year = this.calendar.get(1);
    this.day = this.calendar.get(5);
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if ((paramObject instanceof a))
    {
      paramObject = (a)paramObject;
      bool1 = bool2;
      if (((a)paramObject).day == this.day)
      {
        bool1 = bool2;
        if (((a)paramObject).month == this.month)
        {
          bool1 = bool2;
          if (((a)paramObject).year == this.year) {
            bool1 = true;
          }
        }
      }
    }
    return bool1;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append("{ year: ");
    localStringBuilder.append(this.year);
    localStringBuilder.append(", month: ");
    localStringBuilder.append(this.month);
    localStringBuilder.append(", day: ");
    localStringBuilder.append(this.day);
    localStringBuilder.append(" }");
    return localStringBuilder.toString();
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/chatroom/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */