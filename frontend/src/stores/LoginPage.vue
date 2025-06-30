<script setup>
 // Vue의 Composition API에서 사용하는 핵심 함수들을 임포트
import { computed, reactive, ref } from 'vue';
 // 인증 관련 상태를 관리하는 Pinia 스토어 가져오기
import { useAuthStore } from '@/stores/auth';
 // 라우팅 기능을 사용하기 위해 Vue Router의 useRouter 훅 가져오기
import { useRouter } from 'vue-router';
 // router 인스턴스를 생성하여 페이지 이동 등에 사용
const router = useRouter();
 // 인증 관련 Pinia 스토어 인스턴스를 생성하여 상태나 액션에 접근
const auth = useAuthStore();