package com.tencent.mm.protocal.c;

public final class li
  extends com.tencent.mm.bk.a
{
  public int roA;
  public int roB;
  public String rov;
  public String rox;
  public int roy;
  public int roz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rov != null) {
        paramVarArgs.g(1, this.rov);
      }
      if (this.rox != null) {
        paramVarArgs.g(2, this.rox);
      }
      paramVarArgs.fT(3, this.roy);
      paramVarArgs.fT(4, this.roz);
      paramVarArgs.fT(5, this.roA);
      paramVarArgs.fT(6, this.roB);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rov == null) {
        break label382;
      }
    }
    label382:
    for (paramInt = f.a.a.b.b.a.h(1, this.rov) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rox != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rox);
      }
      return i + f.a.a.a.fQ(3, this.roy) + f.a.a.a.fQ(4, this.roz) + f.a.a.a.fQ(5, this.roA) + f.a.a.a.fQ(6, this.roB);
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
        li localli = (li)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localli.rov = locala.vHC.readString();
          return 0;
        case 2: 
          localli.rox = locala.vHC.readString();
          return 0;
        case 3: 
          localli.roy = locala.vHC.rY();
          return 0;
        case 4: 
          localli.roz = locala.vHC.rY();
          return 0;
        case 5: 
          localli.roA = locala.vHC.rY();
          return 0;
        }
        localli.roB = locala.vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/li.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */