package com.tencent.mm.protocal.c;

import f.a.a.b;
import java.util.LinkedList;

public final class ny
  extends bhp
{
  public int hwV;
  public String hwW;
  public String kLf;
  public String lMY;
  public long rrX;
  public long rrY;
  public String rrZ;
  public String rsa;
  
  protected final int a(int paramInt, Object... paramVarArgs)
  {
    if (paramInt == 0)
    {
      paramVarArgs = (f.a.a.c.a)paramVarArgs[0];
      if (this.six == null) {
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (this.six != null)
      {
        paramVarArgs.fV(1, this.six.boi());
        this.six.a(paramVarArgs);
      }
      paramVarArgs.fT(2, this.hwV);
      if (this.hwW != null) {
        paramVarArgs.g(3, this.hwW);
      }
      paramVarArgs.T(4, this.rrX);
      paramVarArgs.T(5, this.rrY);
      if (this.rrZ != null) {
        paramVarArgs.g(6, this.rrZ);
      }
      if (this.rsa != null) {
        paramVarArgs.g(7, this.rsa);
      }
      if (this.kLf != null) {
        paramVarArgs.g(8, this.kLf);
      }
      if (this.lMY != null) {
        paramVarArgs.g(9, this.lMY);
      }
      return 0;
    }
    if (paramInt == 1) {
      if (this.six == null) {
        break label705;
      }
    }
    label705:
    for (paramInt = f.a.a.a.fS(1, this.six.boi()) + 0;; paramInt = 0)
    {
      int i = paramInt + f.a.a.a.fQ(2, this.hwV);
      paramInt = i;
      if (this.hwW != null) {
        paramInt = i + f.a.a.b.b.a.h(3, this.hwW);
      }
      i = paramInt + f.a.a.a.S(4, this.rrX) + f.a.a.a.S(5, this.rrY);
      paramInt = i;
      if (this.rrZ != null) {
        paramInt = i + f.a.a.b.b.a.h(6, this.rrZ);
      }
      i = paramInt;
      if (this.rsa != null) {
        i = paramInt + f.a.a.b.b.a.h(7, this.rsa);
      }
      paramInt = i;
      if (this.kLf != null) {
        paramInt = i + f.a.a.b.b.a.h(8, this.kLf);
      }
      i = paramInt;
      if (this.lMY != null) {
        i = paramInt + f.a.a.b.b.a.h(9, this.lMY);
      }
      return i;
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
        throw new b("Not all required fields were included: BaseResponse");
      }
      if (paramInt == 3)
      {
        Object localObject1 = (f.a.a.a.a)paramVarArgs[0];
        ny localny = (ny)paramVarArgs[1];
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
            localny.six = ((fl)localObject1);
            paramInt += 1;
          }
        case 2: 
          localny.hwV = ((f.a.a.a.a)localObject1).vHC.rY();
          return 0;
        case 3: 
          localny.hwW = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 4: 
          localny.rrX = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 5: 
          localny.rrY = ((f.a.a.a.a)localObject1).vHC.rZ();
          return 0;
        case 6: 
          localny.rrZ = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 7: 
          localny.rsa = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        case 8: 
          localny.kLf = ((f.a.a.a.a)localObject1).vHC.readString();
          return 0;
        }
        localny.lMY = ((f.a.a.a.a)localObject1).vHC.readString();
        return 0;
      }
      return -1;
    }
  }
}


/* Location:              /Users/Han/Desktop/wxall/微信反编译/反编译 6.6.7/dex2jar-2.0/classes2-dex2jar.jar!/com/tencent/mm/protocal/c/ny.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */