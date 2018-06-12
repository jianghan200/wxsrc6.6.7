package com.tencent.mm.protocal.c;

public final class cgb
  extends com.tencent.mm.bk.a
{
  public String bSc;
  public String mcD;
  public String sAA;
  public String sAz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.sAz != null) {
        paramVarArgs.g(1, this.sAz);
      }
      if (this.bSc != null) {
        paramVarArgs.g(2, this.bSc);
      }
      if (this.mcD != null) {
        paramVarArgs.g(3, this.mcD);
      }
      if (this.sAA != null) {
        paramVarArgs.g(4, this.sAA);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.sAz == null) {
        break label344;
      }
    }
    label344:
    for (int i = f.a.a.b.b.a.h(1, this.sAz) + 0;; i = 0)
    {
      paramInt = i;
      if (this.bSc != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.bSc);
      }
      i = paramInt;
      if (this.mcD != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.mcD);
      }
      paramInt = i;
      if (this.sAA != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.sAA);
      }
      return paramInt;
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
        cgb localcgb = (cgb)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcgb.sAz = locala.vHC.readString();
          return 0;
        case 2: 
          localcgb.bSc = locala.vHC.readString();
          return 0;
        case 3: 
          localcgb.mcD = locala.vHC.readString();
          return 0;
        }
        localcgb.sAA = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/cgb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */