package com.tencent.mm.protocal.c;

public final class ccd
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public String rem;
  public String sdK;
  public int syc;
  public String syd;
  public String sye;
  public String syf;
  public String syg;
  public String syh;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bHD != null) {
        paramVarArgs.g(1, this.bHD);
      }
      if (this.rem != null) {
        paramVarArgs.g(2, this.rem);
      }
      paramVarArgs.fT(3, this.syc);
      if (this.syd != null) {
        paramVarArgs.g(4, this.syd);
      }
      if (this.sdK != null) {
        paramVarArgs.g(5, this.sdK);
      }
      if (this.sye != null) {
        paramVarArgs.g(6, this.sye);
      }
      if (this.syf != null) {
        paramVarArgs.g(7, this.syf);
      }
      if (this.syg != null) {
        paramVarArgs.g(8, this.syg);
      }
      if (this.syh != null) {
        paramVarArgs.g(9, this.syh);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.bHD == null) {
        break label611;
      }
    }
    label611:
    for (paramInt = f.a.a.b.b.a.h(1, this.bHD) + 0;; paramInt = 0)
    {
      int i = paramInt;
      if (this.rem != null) {
        i = paramInt + f.a.a.b.b.a.h(2, this.rem);
      }
      i += f.a.a.a.fQ(3, this.syc);
      paramInt = i;
      if (this.syd != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.syd);
      }
      i = paramInt;
      if (this.sdK != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.sdK);
      }
      paramInt = i;
      if (this.sye != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.sye);
      }
      i = paramInt;
      if (this.syf != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.syf);
      }
      paramInt = i;
      if (this.syg != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.syg);
      }
      i = paramInt;
      if (this.syh != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.syh);
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
        ccd localccd = (ccd)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localccd.bHD = locala.vHC.readString();
          return 0;
        case 2: 
          localccd.rem = locala.vHC.readString();
          return 0;
        case 3: 
          localccd.syc = locala.vHC.rY();
          return 0;
        case 4: 
          localccd.syd = locala.vHC.readString();
          return 0;
        case 5: 
          localccd.sdK = locala.vHC.readString();
          return 0;
        case 6: 
          localccd.sye = locala.vHC.readString();
          return 0;
        case 7: 
          localccd.syf = locala.vHC.readString();
          return 0;
        case 8: 
          localccd.syg = locala.vHC.readString();
          return 0;
        }
        localccd.syh = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/ccd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */