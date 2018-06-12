package com.tencent.mm.protocal.c;

import f.a.a.b;

public final class wr
  extends com.tencent.mm.bk.a
{
  public String appId;
  public String bGy;
  public int bJt;
  public String bSS;
  public String bWQ;
  public String cca;
  public long createTime;
  public boolean dUe = false;
  public String egr;
  public String rBQ;
  public boolean rBR = false;
  public boolean rBc = false;
  public boolean rBd = false;
  public boolean rBe = false;
  public String rBh;
  public boolean rBi = false;
  public boolean rBj = false;
  public boolean rBk = false;
  public boolean rBl = false;
  public boolean rBm = false;
  public String rBn;
  public boolean rBo = false;
  public boolean rBp = false;
  public String toUser;
  
  public final wr CO(int paramInt)
  {
    this.bJt = paramInt;
    this.rBc = true;
    return this;
  }
  
  public final wr VA(String paramString)
  {
    this.bWQ = paramString;
    this.rBj = true;
    return this;
  }
  
  public final wr VB(String paramString)
  {
    this.cca = paramString;
    this.rBk = true;
    return this;
  }
  
  public final wr VC(String paramString)
  {
    this.appId = paramString;
    this.rBl = true;
    return this;
  }
  
  public final wr VD(String paramString)
  {
    this.egr = paramString;
    this.rBm = true;
    return this;
  }
  
  public final wr VE(String paramString)
  {
    this.bGy = paramString;
    this.rBp = true;
    return this;
  }
  
  public final wr Vw(String paramString)
  {
    this.bSS = paramString;
    this.rBd = true;
    return this;
  }
  
  public final wr Vx(String paramString)
  {
    this.toUser = paramString;
    this.rBe = true;
    return this;
  }
  
  public final wr Vy(String paramString)
  {
    this.rBQ = paramString;
    this.rBR = true;
    return this;
  }
  
  public final wr Vz(String paramString)
  {
    this.rBh = paramString;
    this.rBi = true;
    return this;
  }
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (!this.rBc) {
        throw new b("Not all required fields were included: sourceType");
      }
      if (this.rBc == true) {
        paramVarArgs.fT(1, this.bJt);
      }
      if (this.bSS != null) {
        paramVarArgs.g(2, this.bSS);
      }
      if (this.toUser != null) {
        paramVarArgs.g(3, this.toUser);
      }
      if (this.rBQ != null) {
        paramVarArgs.g(4, this.rBQ);
      }
      if (this.rBh != null) {
        paramVarArgs.g(5, this.rBh);
      }
      if (this.dUe == true) {
        paramVarArgs.T(6, this.createTime);
      }
      if (this.bWQ != null) {
        paramVarArgs.g(7, this.bWQ);
      }
      if (this.cca != null) {
        paramVarArgs.g(8, this.cca);
      }
      if (this.appId != null) {
        paramVarArgs.g(9, this.appId);
      }
      if (this.egr != null) {
        paramVarArgs.g(10, this.egr);
      }
      if (this.rBn != null) {
        paramVarArgs.g(11, this.rBn);
      }
      if (this.bGy != null) {
        paramVarArgs.g(12, this.bGy);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.rBc != true) {
        break label908;
      }
    }
    label908:
    for (int i = f.a.a.a.fQ(1, this.bJt) + 0;; i = 0)
    {
      paramInt = i;
      if (this.bSS != null) {
        paramInt = i + f.a.a.b.b.a.h(2, this.bSS);
      }
      i = paramInt;
      if (this.toUser != null) {
        i = paramInt + f.a.a.b.b.a.h(3, this.toUser);
      }
      paramInt = i;
      if (this.rBQ != null) {
        paramInt = i + f.a.a.b.b.a.h(4, this.rBQ);
      }
      i = paramInt;
      if (this.rBh != null) {
        i = paramInt + f.a.a.b.b.a.h(5, this.rBh);
      }
      paramInt = i;
      if (this.dUe == true) {
        paramInt = i + f.a.a.a.S(6, this.createTime);
      }
      i = paramInt;
      if (this.bWQ != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.bWQ);
      }
      paramInt = i;
      if (this.cca != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.cca);
      }
      i = paramInt;
      if (this.appId != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.appId);
      }
      paramInt = i;
      if (this.egr != null) {
        paramInt = i + f.a.a.b.b.a.h(10, this.egr);
      }
      i = paramInt;
      if (this.rBn != null) {
        i = paramInt + f.a.a.b.b.a.h(11, this.rBn);
      }
      paramInt = i;
      if (this.bGy != null) {
        paramInt = i + f.a.a.b.b.a.h(12, this.bGy);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rBc) {
          break;
        }
        throw new b("Not all required fields were included: sourceType");
      }
      if (paramInt == 3)
      {
        f.a.a.a.a locala = (f.a.a.a.a)paramVarArgs[0];
        wr localwr = (wr)paramVarArgs[1];
        switch (((Integer)paramVarArgs[2]).intValue())
        {
        default: 
          return -1;
        case 1: 
          localwr.bJt = locala.vHC.rY();
          localwr.rBc = true;
          return 0;
        case 2: 
          localwr.bSS = locala.vHC.readString();
          localwr.rBd = true;
          return 0;
        case 3: 
          localwr.toUser = locala.vHC.readString();
          localwr.rBe = true;
          return 0;
        case 4: 
          localwr.rBQ = locala.vHC.readString();
          localwr.rBR = true;
          return 0;
        case 5: 
          localwr.rBh = locala.vHC.readString();
          localwr.rBi = true;
          return 0;
        case 6: 
          localwr.createTime = locala.vHC.rZ();
          localwr.dUe = true;
          return 0;
        case 7: 
          localwr.bWQ = locala.vHC.readString();
          localwr.rBj = true;
          return 0;
        case 8: 
          localwr.cca = locala.vHC.readString();
          localwr.rBk = true;
          return 0;
        case 9: 
          localwr.appId = locala.vHC.readString();
          localwr.rBl = true;
          return 0;
        case 10: 
          localwr.egr = locala.vHC.readString();
          localwr.rBm = true;
          return 0;
        case 11: 
          localwr.rBn = locala.vHC.readString();
          localwr.rBo = true;
          return 0;
        }
        localwr.bGy = locala.vHC.readString();
        localwr.rBp = true;
        return 0;
      }
      return -1;
    }
  }
  
  public final wr fU(long paramLong)
  {
    this.createTime = paramLong;
    this.dUe = true;
    return this;
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes6-dex2jar.jar!/com/tencent/mm/protocal/c/wr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */