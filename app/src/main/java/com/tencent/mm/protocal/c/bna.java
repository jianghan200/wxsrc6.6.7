package com.tencent.mm.protocal.c;

public final class bna
  extends com.tencent.mm.bk.a
{
  public String URL;
  public String bHD;
  public String jSP;
  public String rej;
  public String rwt;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.URL != null) {
        paramVarArgs.g(1, this.URL);
      }
      if (this.bHD != null) {
        paramVarArgs.g(2, this.bHD);
      }
      if (this.rej != null) {
        paramVarArgs.g(3, this.rej);
      }
      if (this.jSP != null) {
        paramVarArgs.g(4, this.jSP);
      }
      if (this.rwt != null) {
        paramVarArgs.g(5, this.rwt);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.URL == null) {
        break label399;
      }
    }
    label399:
    for (int i = f.a.a.b.b.a.h(1, this.URL) + 0;; i = 0)
    {
      paramInt = i;
      if (this.bHD != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.bHD);
      }
      i = paramInt;
      if (this.rej != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rej);
      }
      paramInt = i;
      if (this.jSP != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jSP);
      }
      i = paramInt;
      if (this.rwt != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rwt);
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
        bna localbna = (bna)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbna.URL = locala.vHC.readString();
          return 0;
        case 2: 
          localbna.bHD = locala.vHC.readString();
          return 0;
        case 3: 
          localbna.rej = locala.vHC.readString();
          return 0;
        case 4: 
          localbna.jSP = locala.vHC.readString();
          return 0;
        }
        localbna.rwt = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bna.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */