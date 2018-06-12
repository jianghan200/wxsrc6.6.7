package com.tencent.mm.plugin.order.model;

public final class d
  extends com.tencent.mm.bk.a
{
  public String lOy;
  public int month;
  public int year;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.year);
      paramVarArgs.fT(2, this.month);
      if (this.lOy != null) {
        paramVarArgs.g(3, this.lOy);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.year) + 0 + f.a.a.a.fQ(2, this.month);
      paramInt = i;
    } while (this.lOy == null);
    return i + f.a.a.b.b.a.h(3, this.lOy);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      d locald = (d)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        locald.year = locala.vHC.rY();
        return 0;
      case 2: 
        locald.month = locala.vHC.rY();
        return 0;
      }
      locald.lOy = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/plugin/order/model/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */