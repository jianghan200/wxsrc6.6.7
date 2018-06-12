package com.tencent.mm.protocal.c;

import java.util.LinkedList;

public final class bfo
  extends bhp
{
  public String hyz;
  public int kLd;
  public int kLe;
  public String kLf;
  public com.tencent.mm.bk.b sbc;
  public int sbd;
  public int sbe;
  public String sbj;
  public String sbk;
  public String sbl;
  public int sbm;
  public String sbo;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new f.a.a.b("Not all required fields were included: BaseResponse");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.sbd);
      if (this.kLf != null) {
        paramVarArgs.g(3, this.kLf);
      }
      if (this.sbk != null) {
        paramVarArgs.g(4, this.sbk);
      }
      if (this.sbl != null) {
        paramVarArgs.g(5, this.sbl);
      }
      if (this.sbc != null) {
        paramVarArgs.b(6, this.sbc);
      }
      paramVarArgs.fT(7, this.sbe);
      paramVarArgs.fT(8, this.kLd);
      paramVarArgs.fT(9, this.sbm);
      paramVarArgs.fT(10, this.kLe);
      if (this.hyz != null) {
        paramVarArgs.g(11, this.hyz);
      }
      if (this.sbo != null) {
        paramVarArgs.g(12, this.sbo);
      }
      if (this.sbj != null) {
        paramVarArgs.g(13, this.sbj);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label894;
      }
    }
    label894:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.sbd);
      paramInt = i;
      if (this.kLf != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.kLf);
      }
      i = paramInt;
      if (this.sbk != null) {
        i = paramInt + f.a.a.b.b.a.h(4, this.sbk);
      }
      paramInt = i;
      if (this.sbl != null) {
        paramInt = i + f.a.a.b.b.a.h(5, this.sbl);
      }
      i = paramInt;
      if (this.sbc != null) {
        i = paramInt + f.a.a.a.a(6, this.sbc);
      }
      i = i + f.a.a.a.fQ(7, this.sbe) + f.a.a.a.fQ(8, this.kLd) + f.a.a.a.fQ(9, this.sbm) + f.a.a.a.fQ(10, this.kLe);
      paramInt = i;
      if (this.hyz != null) {
        paramInt = i + f.a.a.b.b.a.h(11, this.hyz);
      }
      i = paramInt;
      if (this.sbo != null) {
        i = paramInt + f.a.a.b.b.a.h(12, this.sbo);
      }
      paramInt = i;
      if (this.sbj != null) {
        paramInt = i + f.a.a.b.b.a.h(13, this.sbj);
      }
      return paramInt;
      if (paramInt == 2)
      {
        paramVarArgs = new f.a.a.a.a((byte[])paramVarArgs[0], unknownTagHandler);
        for (paramInt = bhp.a(paramVarArgs); paramInt > 0; paramInt = bhp.a(paramVarArgs)) {
          if (!super.a(paramVarArgs, this, paramInt)) {
            paramVarArgs.cJS();
          }
        }
        if (this.six != null) {
          break;
        }
        throw new f.a.a.b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        bfo localbfo = (bfo)paramVarArgs[1];
        paramInt = ((Integer)paramVarArgs[2]).intValue();
        switch (paramInt)
        {
        default: 
          return -1;
        case 1: 
          paramVarArgs = ((f.a.a.a.a)localObject1).IC(paramInt);
          i = paramVarArgs.size();
          paramInt = 0;
          while (paramInt < i)
          {
            Object localObject2 = (byte[])paramVarArgs.get(paramInt);
            localObject1 = new fl();
            localObject2 = new f.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((fl)localObject1).a((f.a.a.a.a)localObject2, (com.tencent.mm.bk.a)localObject1, bhp.a((f.a.a.a.a)localObject2))) {}
            localbfo.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localbfo.sbd = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localbfo.kLf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localbfo.sbk = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 5: 
          localbfo.sbl = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 6: 
          localbfo.sbc = ((f.a.a.a.a)localObject1).cJR();
          return 0;
        case 7: 
          localbfo.sbe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 8: 
          localbfo.kLd = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 9: 
          localbfo.sbm = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 10: 
          localbfo.kLe = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 11: 
          localbfo.hyz = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 12: 
          localbfo.sbo = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localbfo.sbj = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/bfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */