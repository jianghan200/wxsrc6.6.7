package com.tencent.mm.protocal.c;

public final class cer
  extends com.tencent.mm.bk.a
{
  public int spd;
  public String syk;
  public com.tencent.mm.bk.b szA;
  public com.tencent.mm.bk.b szB;
  public String szC;
  public String szD;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.syk == null) {
        throw new f.a.a.b("Not all required fields were included: Msg");
      }
      paramVarArgs.fT(1, this.spd);
      if (this.syk != null) {
        paramVarArgs.g(2, this.syk);
      }
      if (this.szA != null) {
        paramVarArgs.b(3, this.szA);
      }
      if (this.szB != null) {
        paramVarArgs.b(4, this.szB);
      }
      if (this.szC != null) {
        paramVarArgs.g(5, this.szC);
      }
      if (this.szD != null) {
        paramVarArgs.g(6, this.szD);
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
      i = f.a.a.a.fQ(1, this.spd) + 0;
      paramInt = i;
      if (this.syk != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.syk);
      }
      i = paramInt;
      if (this.szA != null) {
        i = paramInt + f.a.a.a.a(3, this.szA);
      }
      paramInt = i;
      if (this.szB != null) {
        paramInt = i + f.a.a.a.a(4, this.szB);
      }
      i = paramInt;
      if (this.szC != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.szC);
      }
      paramInt = i;
    } while (this.szD == null);
    return i + f.a.a.b.b.a.h(6, this.szD);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.syk == null) {
        throw new f.a.a.b("Not all required fields were included: Msg");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      cer localcer = (cer)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localcer.spd = locala.vHC.rY();
        return 0;
      case 2: 
        localcer.syk = locala.vHC.readString();
        return 0;
      case 3: 
        localcer.szA = locala.cJR();
        return 0;
      case 4: 
        localcer.szB = locala.cJR();
        return 0;
      case 5: 
        localcer.szC = locala.vHC.readString();
        return 0;
      }
      localcer.szD = locala.vHC.readString();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes3-dex2jar.jar!/com/tencent/mm/protocal/c/cer.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */