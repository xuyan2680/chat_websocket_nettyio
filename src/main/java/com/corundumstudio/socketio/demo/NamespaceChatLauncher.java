�}�Z  �   5�یNyG��u
��
�~�_�v�4��������ǥ��"Ͱ]=mt���b���L_?
8��P�A\Ǫ$	]ߚ�Xފ
����!1֋*��71�.m�jݨl�[鏐hsYAB��U�
ڳ<����㳤X��7��>a�Z܇�����צ�b������/͊�>/ʛR��wy~����>*ɕ�E�Q���|�<�����?���k�T����'��J�|	]�3ϣeÿn�x��x�~����f��q��?��9zv!K�x/��(�y��2XKh j�M� ��(���=
84�;��z@�wۤ��e�$�kEF��S�G�:�iA��C���#�jx3���u���Չ����)�0����5YմWZ�o6~
ڀȣ�u�*n��I^[��?��:9L=Ԏ7�d)�Y@,�ksq�j0}o8bach�ZCBZb�/D���v�"�bt����MDO
"ݼ0���x$� �n���8��SqI�y��soPl*|=,�,ӗJk��Gi���T����� MFDr���&���b�)FX9�eC��@���1c���!4<q�����E��*F�k�?+�Zz[#/�/~�n ҕ�;���gQ�� ��
G֡
s�[����[���5��0C��9?g'/m����U0/%*�	��_P�u�չ{kfoÏA�RfI��=2�N��n�2&��4?7ߋ�b�K�d�WE;JZaV.�sBZRD�����-��s���Q�8p�jv�����:h2P7���Ӝ}���u��nIG9��#'D���yWq(ڡ2Wo��#�|�m�s�?*�s�=��R�?Q%�������2Ƨ&�|��fX*�U���̗n�
���\:�7��	�A��Z^r�T`��t� [X�WNPd�^�Z�\�(�"�de��5z�B9�H�6�J��k4/q3����:^�2�D�]byӗ�9q\�,C!m�F��¢��r(���E6W q���+��u1UX��e�O�w�7����=���;��, ChatObject.class, new DataListener<ChatObject>() {
            @Override
            public void onData(SocketIOClient client, ChatObject data, AckRequest ackRequest) {
                // broadcast messages to all clients
                chat2namespace.getBroadcastOperations().sendEvent("message", data);
            }
        });

        server.start();

        Thread.sleep(Integer.MAX_VALUE);

        server.stop();
    }

}
