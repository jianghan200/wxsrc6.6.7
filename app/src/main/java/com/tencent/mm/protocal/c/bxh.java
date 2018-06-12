package com.tencent.mm.protocal.c;

public final class bxh
  extends com.tencent.mm.bk.a
{
  public String hbP;
  public String jPG;
  public String jSv;
  public String rOw;
  public String reT;
  public String ruf;
  public String sbQ;
  public long stL;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.ruf != null) {
        paramVarArgs.g(1, this.ruf);
      }
      if (this.reT != null) {
        paramVarArgs.g(2, this.reT);
      }
      if (this.sbQ != null) {
        paramVarArgs.g(3, this.sbQ);
      }
      if (this.jSv != null) {
        paramVarArgs.g(4, this.jSv);
      }
      if (this.hbP != null) {
        paramVarArgs.g(5, this.hbP);
      }
      if (this.jPG != null) {
        paramVarArgs.g(6, this.jPG);
      }
      if (this.rOw != null) {
        paramVarArgs.g(7, this.rOw);
      }
      paramVarArgs.T(8, this.stL);
      return 0;
    }
    if (paramInt == 1) {
      if (this.ruf == null) {
        break label552;
      }
    }
    label552:
    for (int i = f.a.a.b.b.a.h(1, this.ruf) + 0;; i = 0)
    {
      paramInt = i;
      if (this.reT != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.reT);
      }
      i = paramInt;
      if (this.sbQ != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.sbQ);
      }
      paramInt = i;
      if (this.jSv != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jSv);
      }
      i = paramInt;
      if (this.hbP != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.hbP);
      }
      paramInt = i;
      if (this.jPG != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.jPG);
      }
      i = paramInt;
      if (this.rOw != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rOw);
      }
      return i + f.a.a.a.S(8, this.stL);
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
        bxh localbxh = (bxh)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localbxh.ruf = locala.vHC.readString();
          return 0;
        case 2: 
          localbxh.reT = locala.vHC.readString();
          return 0;
        case 3: 
          localbxh.sbQ = locala.vHC.readString();
          return 0;
        case 4: 
          localbxh.jSv = locala.vHC.readString();
          return 0;
        case 5: 
          localbxh.hbP = locala.vHC.readString();
          return 0;
        case 6: 
          localbxh.jPG = locala.vHC.readString();
          return 0;
        case 7: 
          localbxh.rOw = locala.vHC.readString();
          return 0;
        }
        localbxh.stL = locala.vHC.rZ();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/bxh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */