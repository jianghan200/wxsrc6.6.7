package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class atl
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public String lPl;
  public int rDF;
  public String rDG;
  public int rWO;
  public int rWP;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.bHD == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.lPl == null) {
        throw new b("Not all required fields were included: ThumbUrl");
      }
      paramVarArgs.fT(1, this.rWO);
      if (this.bHD != null) {
        paramVarArgs.g(2, this.bHD);
      }
      if (this.lPl != null) {
        paramVarArgs.g(3, this.lPl);
      }
      paramVarArgs.fT(4, this.rDF);
      if (this.rDG != null) {
        paramVarArgs.g(5, this.rDG);
      }
      paramVarArgs.fT(6, this.rWP);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.rWO) + 0;
      paramInt = i;
      if (this.bHD != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.bHD);
      }
      i = paramInt;
      if (this.lPl != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.lPl);
      }
      i += f.a.a.a.fQ(4, this.rDF);
      paramInt = i;
      if (this.rDG != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.rDG);
      }
      return paramInt + f.a.a.a.fQ(6, this.rWP);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.bHD == null) {
        throw new b("Not all required fields were included: Title");
      }
      if (this.lPl == null) {
        throw new b("Not all required fields were included: ThumbUrl");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      atl localatl = (atl)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localatl.rWO = locala.vHC.rY();
        return 0;
      case 2: 
        localatl.bHD = locala.vHC.readString();
        return 0;
      case 3: 
        localatl.lPl = locala.vHC.readString();
        return 0;
      case 4: 
        localatl.rDF = locala.vHC.rY();
        return 0;
      case 5: 
        localatl.rDG = locala.vHC.readString();
        return 0;
      }
      localatl.rWP = locala.vHC.rY();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/atl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */