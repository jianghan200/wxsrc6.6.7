package com.tencent.mm.protocal.c;

public final class mt
  extends com.tencent.mm.bk.a
{
  public String lMY;
  public int rqH;
  public String rqI;
  public String rqJ;
  public String rqK;
  public int rqL;
  public String rqM;
  public int rqN;
  public String rqO;
  public int rqP;
  public String rqQ;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      paramVarArgs.fT(1, this.rqH);
      if (this.rqI != null) {
        paramVarArgs.g(2, this.rqI);
      }
      if (this.rqJ != null) {
        paramVarArgs.g(3, this.rqJ);
      }
      if (this.rqK != null) {
        paramVarArgs.g(4, this.rqK);
      }
      paramVarArgs.fT(5, this.rqL);
      if (this.rqM != null) {
        paramVarArgs.g(6, this.rqM);
      }
      paramVarArgs.fT(7, this.rqN);
      if (this.lMY != null) {
        paramVarArgs.g(8, this.lMY);
      }
      if (this.rqO != null) {
        paramVarArgs.g(9, this.rqO);
      }
      paramVarArgs.fT(10, this.rqP);
      if (this.rqQ != null) {
        paramVarArgs.g(11, this.rqQ);
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
      i = f.a.a.a.fQ(1, this.rqH) + 0;
      paramInt = i;
      if (this.rqI != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rqI);
      }
      i = paramInt;
      if (this.rqJ != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.rqJ);
      }
      paramInt = i;
      if (this.rqK != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rqK);
      }
      i = paramInt + f.a.a.a.fQ(5, this.rqL);
      paramInt = i;
      if (this.rqM != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rqM);
      }
      i = paramInt + f.a.a.a.fQ(7, this.rqN);
      paramInt = i;
      if (this.lMY != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.lMY);
      }
      i = paramInt;
      if (this.rqO != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.rqO);
      }
      i += f.a.a.a.fQ(10, this.rqP);
      paramInt = i;
    } while (this.rqQ == null);
    return i + f.a.a.b.b.a.h(11, this.rqQ);
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
      mt localmt = (mt)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localmt.rqH = locala.vHC.rY();
        return 0;
      case 2: 
        localmt.rqI = locala.vHC.readString();
        return 0;
      case 3: 
        localmt.rqJ = locala.vHC.readString();
        return 0;
      case 4: 
        localmt.rqK = locala.vHC.readString();
        return 0;
      case 5: 
        localmt.rqL = locala.vHC.rY();
        return 0;
      case 6: 
        localmt.rqM = locala.vHC.readString();
        return 0;
      case 7: 
        localmt.rqN = locala.vHC.rY();
        return 0;
      case 8: 
        localmt.lMY = locala.vHC.readString();
        return 0;
      case 9: 
        localmt.rqO = locala.vHC.readString();
        return 0;
      case 10: 
        localmt.rqP = locala.vHC.rY();
        return 0;
      }
      localmt.rqQ = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes7-dex2jar.jar!/com/tencent/mm/protocal/c/mt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */