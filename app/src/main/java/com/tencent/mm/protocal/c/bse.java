package com.tencent.mm.protocal.c;

public final class bse
  extends com.tencent.mm.bk.a
{
  public String hbL;
  public String rqY;
  public int ruw;
  public int seX;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.hbL != null) {
        paramVarArgs.g(1, this.hbL);
      }
      if (this.rqY != null) {
        paramVarArgs.g(2, this.rqY);
      }
      paramVarArgs.fT(3, this.seX);
      paramVarArgs.fT(4, this.ruw);
      return 0;
    }
    if (paramInt == 1) {
      if (this.hbL == null) {
        break label308;
      }
    }
    label308:
    for (paramInt = f.a.a.b.b.a.h(1, this.hbL) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rqY != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rqY);
      }
      return i + f.a.a.a.fQ(3, this.seX) + f.a.a.a.fQ(4, this.ruw);
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        break;
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        bse localbse = (bse)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbse.hbL = locala.vHC.readString();
          return 0;
        case 2: 
          localbse.rqY = locala.vHC.readString();
          return 0;
        case 3: 
          localbse.seX = locala.vHC.rY();
          return 0;
        }
        localbse.ruw = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/bse.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */