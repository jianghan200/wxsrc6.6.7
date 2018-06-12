package com.tencent.mm.protocal.c;

public final class cen
  extends com.tencent.mm.bk.a
{
  public String bHD;
  public String jSA;
  public int jTt;
  public com.tencent.mm.bk.b szc;
  public String szk;
  public int szw;
  public boolean szx;
  public boolean szy;
  public boolean szz;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.szk == null) {
        throw new f.a.a.b("Not all required fields were included: Talker");
      }
      if (this.bHD == null) {
        throw new f.a.a.b("Not all required fields were included: Title");
      }
      if (this.jSA == null) {
        throw new f.a.a.b("Not all required fields were included: Content");
      }
      paramVarArgs.fT(1, this.jTt);
      if (this.szk != null) {
        paramVarArgs.g(2, this.szk);
      }
      if (this.bHD != null) {
        paramVarArgs.g(3, this.bHD);
      }
      if (this.jSA != null) {
        paramVarArgs.g(4, this.jSA);
      }
      paramVarArgs.fT(5, this.szw);
      if (this.szc != null) {
        paramVarArgs.b(6, this.szc);
      }
      paramVarArgs.av(7, this.szx);
      paramVarArgs.av(8, this.szy);
      paramVarArgs.av(9, this.szz);
      return 0;
    }
    if (paramInt == 1)
    {
      int i = f.a.a.a.fQ(1, this.jTt) + 0;
      paramInt = i;
      if (this.szk != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.szk);
      }
      i = paramInt;
      if (this.bHD != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.bHD);
      }
      paramInt = i;
      if (this.jSA != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.jSA);
      }
      i = paramInt + f.a.a.a.fQ(5, this.szw);
      paramInt = i;
      if (this.szc != null) {
        paramInt = i + f.a.a.a.a(6, this.szc);
      }
      return paramInt + (f.a.a.b.b.a.ec(7) + 1) + (f.a.a.b.b.a.ec(8) + 1) + (f.a.a.b.b.a.ec(9) + 1);
    }
    if (paramInt == 2)
    {
      paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
      for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
        if (!super.a(paramVarArgs, this, paramInt)) {
          paramVarArgs.cJS();
        }
      }
      if (this.szk == null) {
        throw new f.a.a.b("Not all required fields were included: Talker");
      }
      if (this.bHD == null) {
        throw new f.a.a.b("Not all required fields were included: Title");
      }
      if (this.jSA == null) {
        throw new f.a.a.b("Not all required fields were included: Content");
      }
      return 0;
    }
    if (paramInt == 3)
    {
      f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
      cen localcen = (cen)paramVarArgs[1];
      switch (((Integer)paramVarArgs[2]).intValue())
      {
      default: 
        return -1;
      case 1: 
        localcen.jTt = locala.vHC.rY();
        return 0;
      case 2: 
        localcen.szk = locala.vHC.readString();
        return 0;
      case 3: 
        localcen.bHD = locala.vHC.readString();
        return 0;
      case 4: 
        localcen.jSA = locala.vHC.readString();
        return 0;
      case 5: 
        localcen.szw = locala.vHC.rY();
        return 0;
      case 6: 
        localcen.szc = locala.cJR();
        return 0;
      case 7: 
        localcen.szx = locala.cJQ();
        return 0;
      case 8: 
        localcen.szy = locala.cJQ();
        return 0;
      }
      localcen.szz = locala.cJQ();
      return 0;
    }
    return -1;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/cen.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */