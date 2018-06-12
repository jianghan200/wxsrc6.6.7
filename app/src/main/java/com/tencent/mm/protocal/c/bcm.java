package com.tencent.mm.protocal.c;

public final class bcm
  extends com.tencent.mm.bk.a
{
  public int iwS;
  public String iwT;
  public int kpu;
  public String kpv;
  public int sdf;
  public int seG;
  public int seH;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.sdf);
      paramVarArgs.fT(2, this.seH);
      paramVarArgs.fT(3, this.seG);
      paramVarArgs.fT(4, this.iwS);
      if (this.iwT != null) {
        paramVarArgs.g(5, this.iwT);
      }
      paramVarArgs.fT(6, this.kpu);
      if (this.kpv != null) {
        paramVarArgs.g(7, this.kpv);
      }
      paramInt = 0;
    }
    int i;
    do
    {
      return paramInt;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.sdf) + 0 + f.a.a.a.fQ(2, this.seH) + f.a.a.a.fQ(3, this.seG) + f.a.a.a.fQ(4, this.iwS);
      paramInt = i;
      if (this.iwT != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.iwT);
      }
      i = paramInt + f.a.a.a.fQ(6, this.kpu);
      paramInt = i;
    } while (this.kpv == null);
    return i + f.a.a.b.b.a.h(7, this.kpv);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      bcm localbcm = (bcm)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbcm.sdf = locala.vHC.rY();
        return 0;
      case 2: 
        localbcm.seH = locala.vHC.rY();
        return 0;
      case 3: 
        localbcm.seG = locala.vHC.rY();
        return 0;
      case 4: 
        localbcm.iwS = locala.vHC.rY();
        return 0;
      case 5: 
        localbcm.iwT = locala.vHC.readString();
        return 0;
      case 6: 
        localbcm.kpu = locala.vHC.rY();
        return 0;
      }
      localbcm.kpv = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes5-dex2jar.jar!/com/tencent/mm/protocal/c/bcm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */