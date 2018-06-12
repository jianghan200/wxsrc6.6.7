package com.tencent.mm.protocal.c;

public final class cfn
  extends com.tencent.mm.bk.a
{
  public String bhd;
  public String ixy;
  public String ixz;
  public String lRt;
  public String nzH;
  public String pLA;
  public String pLB;
  public String pLC;
  public String pLr;
  public String pLs;
  public String pLt;
  public String pLu;
  public long pLv;
  public String pLw;
  public String pLx;
  public String pLy;
  public String pLz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.pLr != null) {
        paramVarArgs.g(1, this.pLr);
      }
      if (this.pLs != null) {
        paramVarArgs.g(2, this.pLs);
      }
      if (this.pLt != null) {
        paramVarArgs.g(3, this.pLt);
      }
      if (this.pLu != null) {
        paramVarArgs.g(4, this.pLu);
      }
      paramVarArgs.T(5, this.pLv);
      if (this.pLz != null) {
        paramVarArgs.g(6, this.pLz);
      }
      if (this.ixy != null) {
        paramVarArgs.g(7, this.ixy);
      }
      if (this.ixz != null) {
        paramVarArgs.g(8, this.ixz);
      }
      if (this.nzH != null) {
        paramVarArgs.g(9, this.nzH);
      }
      if (this.pLw != null) {
        paramVarArgs.g(10, this.pLw);
      }
      if (this.pLx != null) {
        paramVarArgs.g(11, this.pLx);
      }
      if (this.pLy != null) {
        paramVarArgs.g(12, this.pLy);
      }
      if (this.bhd != null) {
        paramVarArgs.g(13, this.bhd);
      }
      if (this.lRt != null) {
        paramVarArgs.g(14, this.lRt);
      }
      if (this.pLA != null) {
        paramVarArgs.g(15, this.pLA);
      }
      if (this.pLB != null) {
        paramVarArgs.g(16, this.pLB);
      }
      if (this.pLC != null) {
        paramVarArgs.g(17, this.pLC);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.pLr == null) {
        break label1067;
      }
    }
    label1067:
    for (int i = f.a.a.b.b.a.h(1, this.pLr) + 0;; i = 0)
    {
      paramInt = i;
      if (this.pLs != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.pLs);
      }
      i = paramInt;
      if (this.pLt != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.pLt);
      }
      paramInt = i;
      if (this.pLu != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.pLu);
      }
      i = paramInt + f.a.a.a.S(5, this.pLv);
      paramInt = i;
      if (this.pLz != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.pLz);
      }
      i = paramInt;
      if (this.ixy != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.ixy);
      }
      paramInt = i;
      if (this.ixz != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.ixz);
      }
      i = paramInt;
      if (this.nzH != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.nzH);
      }
      paramInt = i;
      if (this.pLw != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.pLw);
      }
      i = paramInt;
      if (this.pLx != null) {
        i = paramInt + f.a.a.b.b.a.h(11, this.pLx);
      }
      paramInt = i;
      if (this.pLy != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.pLy);
      }
      i = paramInt;
      if (this.bhd != null) {
        i = paramInt + f.a.a.b.b.a.h(13, this.bhd);
      }
      paramInt = i;
      if (this.lRt != null) {
        paramInt = i + f.a.a.b.b.a.h(14, this.lRt);
      }
      i = paramInt;
      if (this.pLA != null) {
        i = paramInt + f.a.a.b.b.a.h(15, this.pLA);
      }
      paramInt = i;
      if (this.pLB != null) {
        paramInt = i + f.a.a.b.b.a.h(16, this.pLB);
      }
      i = paramInt;
      if (this.pLC != null) {
        i = paramInt + f.a.a.b.b.a.h(17, this.pLC);
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
        cfn localcfn = (cfn)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localcfn.pLr = locala.vHC.readString();
          return 0;
        case 2: 
          localcfn.pLs = locala.vHC.readString();
          return 0;
        case 3: 
          localcfn.pLt = locala.vHC.readString();
          return 0;
        case 4: 
          localcfn.pLu = locala.vHC.readString();
          return 0;
        case 5: 
          localcfn.pLv = locala.vHC.rZ();
          return 0;
        case 6: 
          localcfn.pLz = locala.vHC.readString();
          return 0;
        case 7: 
          localcfn.ixy = locala.vHC.readString();
          return 0;
        case 8: 
          localcfn.ixz = locala.vHC.readString();
          return 0;
        case 9: 
          localcfn.nzH = locala.vHC.readString();
          return 0;
        case 10: 
          localcfn.pLw = locala.vHC.readString();
          return 0;
        case 11: 
          localcfn.pLx = locala.vHC.readString();
          return 0;
        case 12: 
          localcfn.pLy = locala.vHC.readString();
          return 0;
        case 13: 
          localcfn.bhd = locala.vHC.readString();
          return 0;
        case 14: 
          localcfn.lRt = locala.vHC.readString();
          return 0;
        case 15: 
          localcfn.pLA = locala.vHC.readString();
          return 0;
        case 16: 
          localcfn.pLB = locala.vHC.readString();
          return 0;
        }
        localcfn.pLC = locala.vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/cfn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */