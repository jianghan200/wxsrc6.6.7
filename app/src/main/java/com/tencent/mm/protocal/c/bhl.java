package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bhl
  extends com.tencent.mm.bk.a
{
  public String jPK;
  public int ruE;
  public com.tencent.mm.bk.b rwb;
  public String rwt;
  public int sir;
  public int sis;
  public LinkedList<bns> sit = new LinkedList();
  public String siu;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.rwt == null) {
        throw new f.a.a.b("Not all required fields were included: MD5");
      }
      if (this.jPK == null) {
        throw new f.a.a.b("Not all required fields were included: Url");
      }
      if (this.siu == null) {
        throw new f.a.a.b("Not all required fields were included: OriginalMD5");
      }
      if (this.rwt != null) {
        paramVarArgs.g(1, this.rwt);
      }
      paramVarArgs.fT(2, this.sir);
      if (this.jPK != null) {
        paramVarArgs.g(3, this.jPK);
      }
      paramVarArgs.fT(4, this.sis);
      paramVarArgs.d(5, 8, this.sit);
      if (this.rwb != null) {
        paramVarArgs.b(6, this.rwb);
      }
      if (this.siu != null) {
        paramVarArgs.g(7, this.siu);
      }
      paramVarArgs.fT(8, this.ruE);
      return 0;
    }
    if (paramInt == 1) {
      if (this.rwt == null) {
        break label695;
      }
    }
    label695:
    for (paramInt = f.a.a.b.b.a.h(1, this.rwt) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.sir);
      paramInt = i;
      if (this.jPK != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.jPK);
      }
      i = paramInt + f.a.a.a.fQ(4, this.sis) + f.a.a.a.c(5, 8, this.sit);
      paramInt = i;
      if (this.rwb != null) {
        paramInt = i + f.a.a.a.a(6, this.rwb);
      }
      i = paramInt;
      if (this.siu != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.siu);
      }
      return i + f.a.a.a.fQ(8, this.ruE);
      if (paramInt == 2)
      {
        paramVarArgs = (byte[])paramVarArgs[0];
        this.sit.clear();
        paramVarArgs = new f.a.a.a.a(paramVarArgs, unknownTagHandler);
        for (paramInt = com.tencent.mm.bk.a.a(paramVarArgs); paramInt > 0; paramInt = com.tencent.mm.bk.a.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.rwt == null) {
          throw new f.a.a.b("Not all required fields were included: MD5");
        }
        if (this.jPK == null) {
          throw new f.a.a.b("Not all required fields were included: Url");
        }
        if (this.siu != null) {
          break;
        }
        throw new f.a.a.b("Not all required fields were included: OriginalMD5");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bhl localbhl = (bhl)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          localbhl.rwt = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 2: 
          localbhl.sir = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbhl.jPK = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbhl.sis = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 5: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new bns();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((bns)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, com.tencent.mm.bk.a.a((f.a.a.a.a)localObject2))) {}
            localbhl.sit.add(localObject1);
            paramInt += 1;
          }
        case 6: 
          localbhl.rwb = ((f.a.a.a.a)localObject1).cJR();
          return 0;
        case 7: 
          localbhl.siu = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbhl.ruE = ((f.a.a.a.a)localObject1).vHC.rY();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes4-dex2jar.jar!/com/tencent/mm/protocal/c/bhl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */