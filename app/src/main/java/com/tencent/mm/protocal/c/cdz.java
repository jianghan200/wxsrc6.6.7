package com.tencent.mm.protocal.c;

public final class cdz
  extends com.tencent.mm.bk.a
{
  public String hbL;
  public String hcS;
  public String jSA;
  public int jTt;
  public com.tencent.mm.bk.b szc;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    int i;
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.hbL == null) {
        throw new f.a.a.b("Not all required fields were included: UserName");
      }
      if (this.hcS == null) {
        throw new f.a.a.b("Not all required fields were included: NickName");
      }
      if (this.jSA == null) {
        throw new f.a.a.b("Not all required fields were included: Content");
      }
      paramVarArgs.fT(1, this.jTt);
      if (this.hbL != null) {
        paramVarArgs.g(2, this.hbL);
      }
      if (this.hcS != null) {
        paramVarArgs.g(3, this.hcS);
      }
      if (this.jSA != null) {
        paramVarArgs.g(4, this.jSA);
      }
      if (this.szc != null) {
        paramVarArgs.b(5, this.szc);
      }
      i = 0;
    }
    do
    {
      return i;
      if (paramInt != 1) {
        break;
      }
      i = f.a.a.a.fQ(1, this.jTt) + 0;
      paramInt = i;
      if (this.hbL != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.hbL);
      }
      i = paramInt;
      if (this.hcS != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.hcS);
      }
      paramInt = i;
      if (this.jSA != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jSA);
      }
      i = paramInt;
    } while (this.szc == null);
    return paramInt + f.a.a.a.a(5, this.szc);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.hbL == null) {
        throw new f.a.a.b("Not all required fields were included: UserName");
      }
      if (this.hcS == null) {
        throw new f.a.a.b("Not all required fields were included: NickName");
      }
      if (this.jSA == null) {
        throw new f.a.a.b("Not all required fields were included: Content");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      cdz localcdz = (cdz)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localcdz.jTt = locala.vHC.rY();
        return 0;
      case 2: 
        localcdz.hbL = locala.vHC.readString();
        return 0;
      case 3: 
        localcdz.hcS = locala.vHC.readString();
        return 0;
      case 4: 
        localcdz.jSA = locala.vHC.readString();
        return 0;
      }
      localcdz.szc = locala.cJR();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/cdz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */