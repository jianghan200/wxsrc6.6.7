package com.tencent.mm.protocal.c;

public final class aky
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public String jOS;
  public String jPG;
  public String rNO;
  public String rNP;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rNO != null) {
        paramVarArgs.g(1, this.rNO);
      }
      if (this.jPG != null) {
        paramVarArgs.g(2, this.jPG);
      }
      if (this.bHD != null) {
        paramVarArgs.g(3, this.bHD);
      }
      if (this.jOS != null) {
        paramVarArgs.g(4, this.jOS);
      }
      if (this.rNP != null) {
        paramVarArgs.g(5, this.rNP);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rNO == null) {
        break label399;
      }
    }
    label399:
    for (int i = f.a.a.b.b.a.h(1, this.rNO) + 0;; i = 0)
    {
      paramInt = i;
      if (this.jPG != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.jPG);
      }
      i = paramInt;
      if (this.bHD != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.bHD);
      }
      paramInt = i;
      if (this.jOS != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jOS);
      }
      i = paramInt;
      if (this.rNP != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rNP);
      }
      return i;
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
        aky localaky = (aky)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localaky.rNO = locala.vHC.readString();
          return 0;
        case 2: 
          localaky.jPG = locala.vHC.readString();
          return 0;
        case 3: 
          localaky.bHD = locala.vHC.readString();
          return 0;
        case 4: 
          localaky.jOS = locala.vHC.readString();
          return 0;
        }
        localaky.rNP = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/aky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */