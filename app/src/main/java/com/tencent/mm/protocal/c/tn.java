package com.tencent.mm.protocal.c;

public final class tn
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public String jOS;
  public String rwN;
  public String rwO;
  public String rwP;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bHD != null) {
        paramVarArgs.g(1, this.bHD);
      }
      if (this.rwN != null) {
        paramVarArgs.g(2, this.rwN);
      }
      if (this.rwO != null) {
        paramVarArgs.g(3, this.rwO);
      }
      if (this.jOS != null) {
        paramVarArgs.g(4, this.jOS);
      }
      if (this.rwP != null) {
        paramVarArgs.g(5, this.rwP);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.bHD == null) {
        break label399;
      }
    }
    label399:
    for (int i = f.a.a.b.b.a.h(1, this.bHD) + 0;; i = 0)
    {
      paramInt = i;
      if (this.rwN != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rwN);
      }
      i = paramInt;
      if (this.rwO != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rwO);
      }
      paramInt = i;
      if (this.jOS != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jOS);
      }
      i = paramInt;
      if (this.rwP != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rwP);
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
        tn localtn = (tn)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localtn.bHD = locala.vHC.readString();
          return 0;
        case 2: 
          localtn.rwN = locala.vHC.readString();
          return 0;
        case 3: 
          localtn.rwO = locala.vHC.readString();
          return 0;
        case 4: 
          localtn.jOS = locala.vHC.readString();
          return 0;
        }
        localtn.rwP = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/tn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */