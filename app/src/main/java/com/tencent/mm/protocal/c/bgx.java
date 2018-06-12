package com.tencent.mm.protocal.c;

public final class bgx
  extends com.tencent.mm.bk.a
{
  public int otY;
  public int rQf;
  public String rUM;
  public long rll;
  public int rtz;
  public long see;
  public String shJ;
  public String shK;
  public int shL;
  public int shM;
  public int shN;
  public String shO;
  public String shP;
  public String shQ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.otY);
      if (this.rUM != null) {
        paramVarArgs.g(2, this.rUM);
      }
      if (this.shJ != null) {
        paramVarArgs.g(3, this.shJ);
      }
      paramVarArgs.T(4, this.rll);
      if (this.shK != null) {
        paramVarArgs.g(5, this.shK);
      }
      paramVarArgs.fT(6, this.shL);
      paramVarArgs.fT(7, this.shM);
      paramVarArgs.fT(8, this.shN);
      paramVarArgs.T(9, this.see);
      paramVarArgs.fT(10, this.rQf);
      if (this.shO != null) {
        paramVarArgs.g(11, this.shO);
      }
      paramVarArgs.fT(12, this.rtz);
      if (this.shP != null) {
        paramVarArgs.g(13, this.shP);
      }
      if (this.shQ != null) {
        paramVarArgs.g(14, this.shQ);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.otY) + 0;
      paramInt = i;
      if (this.rUM != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rUM);
      }
      i = paramInt;
      if (this.shJ != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.shJ);
      }
      i += f.a.a.a.S(4, this.rll);
      paramInt = i;
      if (this.shK != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.shK);
      }
      i = paramInt + f.a.a.a.fQ(6, this.shL) + f.a.a.a.fQ(7, this.shM) + f.a.a.a.fQ(8, this.shN) + f.a.a.a.S(9, this.see) + f.a.a.a.fQ(10, this.rQf);
      paramInt = i;
      if (this.shO != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.shO);
      }
      i = paramInt + f.a.a.a.fQ(12, this.rtz);
      paramInt = i;
      if (this.shP != null) {
        paramInt = i + f.a.a.b.b.a.h(13, this.shP);
      }
      i = paramInt;
    } while (this.shQ == null);
    return paramInt + f.a.a.b.b.a.h(14, this.shQ);
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
      bgx localbgx = (bgx)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localbgx.otY = locala.vHC.rY();
        return 0;
      case 2: 
        localbgx.rUM = locala.vHC.readString();
        return 0;
      case 3: 
        localbgx.shJ = locala.vHC.readString();
        return 0;
      case 4: 
        localbgx.rll = locala.vHC.rZ();
        return 0;
      case 5: 
        localbgx.shK = locala.vHC.readString();
        return 0;
      case 6: 
        localbgx.shL = locala.vHC.rY();
        return 0;
      case 7: 
        localbgx.shM = locala.vHC.rY();
        return 0;
      case 8: 
        localbgx.shN = locala.vHC.rY();
        return 0;
      case 9: 
        localbgx.see = locala.vHC.rZ();
        return 0;
      case 10: 
        localbgx.rQf = locala.vHC.rY();
        return 0;
      case 11: 
        localbgx.shO = locala.vHC.readString();
        return 0;
      case 12: 
        localbgx.rtz = locala.vHC.rY();
        return 0;
      case 13: 
        localbgx.shP = locala.vHC.readString();
        return 0;
      }
      localbgx.shQ = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes-dex2jar.jar!/com/tencent/mm/protocal/c/bgx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */