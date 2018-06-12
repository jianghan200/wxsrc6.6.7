package com.tencent.mm.protocal.c;

public final class cej
  extends com.tencent.mm.bk.a
{
  public int jQd;
  public String jSA;
  public String rTW;
  public String szk;
  public long szl;
  public long szq;
  public boolean szr;
  public com.tencent.mm.bk.b szs;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rTW == null) {
        throw new f.a.a.b("Not all required fields were included: Nickname");
      }
      if (this.jSA == null) {
        throw new f.a.a.b("Not all required fields were included: Content");
      }
      if (this.szk == null) {
        throw new f.a.a.b("Not all required fields were included: Talker");
      }
      paramVarArgs.T(1, this.szl);
      if (this.rTW != null) {
        paramVarArgs.g(2, this.rTW);
      }
      if (this.jSA != null) {
        paramVarArgs.g(3, this.jSA);
      }
      paramVarArgs.fT(4, this.jQd);
      if (this.szk != null) {
        paramVarArgs.g(5, this.szk);
      }
      paramVarArgs.T(6, this.szq);
      paramVarArgs.av(7, this.szr);
      if (this.szs != null) {
        paramVarArgs.b(8, this.szs);
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
      i = f.a.a.a.S(1, this.szl) + 0;
      paramInt = i;
      if (this.rTW != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.rTW);
      }
      i = paramInt;
      if (this.jSA != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.jSA);
      }
      i += f.a.a.a.fQ(4, this.jQd);
      paramInt = i;
      if (this.szk != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.szk);
      }
      i = paramInt + f.a.a.a.S(6, this.szq) + (f.a.a.b.b.a.ec(7) + 1);
      paramInt = i;
    } while (this.szs == null);
    return i + f.a.a.a.a(8, this.szs);
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.rTW == null) {
        throw new f.a.a.b("Not all required fields were included: Nickname");
      }
      if (this.jSA == null) {
        throw new f.a.a.b("Not all required fields were included: Content");
      }
      if (this.szk == null) {
        throw new f.a.a.b("Not all required fields were included: Talker");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      cej localcej = (cej)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localcej.szl = locala.vHC.rZ();
        return 0;
      case 2: 
        localcej.rTW = locala.vHC.readString();
        return 0;
      case 3: 
        localcej.jSA = locala.vHC.readString();
        return 0;
      case 4: 
        localcej.jQd = locala.vHC.rY();
        return 0;
      case 5: 
        localcej.szk = locala.vHC.readString();
        return 0;
      case 6: 
        localcej.szq = locala.vHC.rZ();
        return 0;
      case 7: 
        localcej.szr = locala.cJQ();
        return 0;
      }
      localcej.szs = locala.cJR();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/cej.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */