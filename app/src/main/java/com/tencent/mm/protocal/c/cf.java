package com.tencent.mm.protocal.c;

public final class cf
  extends com.tencent.mm.bk.a
{
  public String eJI;
  public String eJJ;
  public String eJQ;
  public String hbL;
  public String jQf;
  public String rcA;
  public String rcz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.eJQ != null) {
        paramVarArgs.g(1, this.eJQ);
      }
      if (this.eJI != null) {
        paramVarArgs.g(2, this.eJI);
      }
      if (this.eJJ != null) {
        paramVarArgs.g(3, this.eJJ);
      }
      if (this.jQf != null) {
        paramVarArgs.g(4, this.jQf);
      }
      if (this.hbL != null) {
        paramVarArgs.g(5, this.hbL);
      }
      if (this.rcz != null) {
        paramVarArgs.g(6, this.rcz);
      }
      if (this.rcA != null) {
        paramVarArgs.g(7, this.rcA);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.eJQ == null) {
        break label513;
      }
    }
    label513:
    for (int i = f.a.a.b.b.a.h(1, this.eJQ) + 0;; i = 0)
    {
      paramInt = i;
      if (this.eJI != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.eJI);
      }
      i = paramInt;
      if (this.eJJ != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.eJJ);
      }
      paramInt = i;
      if (this.jQf != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jQf);
      }
      i = paramInt;
      if (this.hbL != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.hbL);
      }
      paramInt = i;
      if (this.rcz != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rcz);
      }
      i = paramInt;
      if (this.rcA != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rcA);
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
        cf localcf = (cf)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcf.eJQ = locala.vHC.readString();
          return 0;
        case 2: 
          localcf.eJI = locala.vHC.readString();
          return 0;
        case 3: 
          localcf.eJJ = locala.vHC.readString();
          return 0;
        case 4: 
          localcf.jQf = locala.vHC.readString();
          return 0;
        case 5: 
          localcf.hbL = locala.vHC.readString();
          return 0;
        case 6: 
          localcf.rcz = locala.vHC.readString();
          return 0;
        }
        localcf.rcA = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/cf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */